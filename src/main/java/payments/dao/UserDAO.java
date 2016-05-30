package payments.dao;

import payments.entities.User;
import payments.exceptions.DBException;

/**
 * Basic interface for all UserDAO.
 *
 * @author Yulia
 *
 */
public interface UserDAO{
    /**
     * Find user by client id
     * @param clientId id of user
     * @return user by id
     * @throws DBException
     */
    User findUserByClientId(final int clientId) throws DBException, DBException;

}
