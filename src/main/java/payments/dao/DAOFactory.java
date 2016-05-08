package payments.dao;

import payments.dao.daoImpl.UserDAOImpl;
import payments.dao.daoFactoryImpl.MysqlDAOFactory;
import payments.dao.daoFactoryImpl.MysqlDAOFactory;

/**
 * Interface DAO Factory
 *
 * @author Yulia
 * @since 05.05.2016.
 */
public abstract class DAOFactory {

    public static final int MYSQL = 1;
    public static final int ORACLE = 2;

    /**
     * Factory Method for UserDAOImpl.
     *
     * @return UserDAOImpl
     */
    public abstract UserDAOImpl getUserDAO();

    /**
     * Factory method allows to get necessary instance of DAOFactory.
     */
    public static DAOFactory getDAOFactory(int whichFactory) {
        switch (whichFactory) {
            case MYSQL:
                return new MysqlDAOFactory();
            // It will be necessary if you change sql server.
//            case ORACLE:
//                return new OracleDAOFactory();
            default:
                return null;
        }
    }
}
