package payments.dao.daoImpl;


import payments.common.Messages;
import payments.common.Queries;
import payments.dao.UserDAO;
import payments.dao.daoFactoryImpl.MysqlDAOFactory;
import payments.entities.User;
import payments.exceptions.DBException;
import payments.managers.ConnectionManager;
import payments.utilities.LogUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAOImpl implements UserDAO {

    private Connection connection;

    /**
     * Find user by client id
     *
     * @param clientId id of user
     * @return user by id
     * @throws DBException
     */
    @Override
    public User findUserByClientId(int clientId) throws DBException {
        User user = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = MysqlDAOFactory.createConnection();
            preparedStatement = connection.prepareStatement(Queries.SQL_FIND_USER_BY_CLIENT_ID);
            preparedStatement.setInt(1, clientId);
            resultSet = preparedStatement.executeQuery();
            connection.commit();
            if (resultSet.next()) {
                user = new User(resultSet);
            }
        } catch (SQLException e) {
            LogUtility.exception(Messages.ERR_CANNOT_FIND_USER_BY_CLIENT_ID, e);
            ConnectionManager.rollback(connection);
            throw new DBException(Messages.ERR_CANNOT_UPDATE_USER_STATE_BY_CLIENT_ID, e);
        } finally {
            ConnectionManager.close(resultSet, preparedStatement, connection);
        }
        return user;
    }
}
