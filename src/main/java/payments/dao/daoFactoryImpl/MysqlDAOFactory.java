package payments.dao.daoFactoryImpl;


import payments.common.Messages;
import payments.dao.DAOFactory;
import payments.dao.daoImpl.UserDAOImpl;
import payments.exceptions.DBException;
import payments.utilities.LogUtility;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class MysqlDAOFactory extends DAOFactory {

    public static Connection createConnection() throws DBException {
        Connection connection = null;
        try {
            Context initContext = new InitialContext();
            DataSource dataSource = (DataSource) initContext.lookup("java:/comp/env/jdbc/Payments");
            connection = dataSource.getConnection();
            connection.setAutoCommit(false);
        } catch (NamingException e) {
            LogUtility.exception(Messages.ERR_CANNOT_INIT_CONNECTION_POOL, e);
            throw new DBException(Messages.ERR_CANNOT_INIT_CONNECTION_POOL, e);
        } catch (SQLException e) {
            LogUtility.exception(Messages.ERR_CANNOT_GET_CONNECTION_FROM_DS, e);
            throw new DBException(Messages.ERR_CANNOT_GET_CONNECTION_FROM_DS, e);
        }
        return connection;
    }

    /**
     * Factory Method for UserDAOImpl.
     *
     * @return UserDAOImpl
     */
    @Override
    public UserDAOImpl getUserDAO() {
        return new UserDAOImpl();
    }
}
