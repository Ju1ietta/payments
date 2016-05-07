package main.payments.dao;

/**
 * Interface DAO Factory
 *
 * @author Yulia
 * @since 05.05.2016.
 */
public interface DAOFactory {
    /**
     * Factory Method for UserDAO.
     *
     * @return UserDAO
     */
    UserDAO getUserDAO();
}
