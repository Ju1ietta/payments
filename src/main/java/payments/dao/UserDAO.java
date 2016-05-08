package payments.dao;

import payments.entities.User;
import payments.exceptions.dbExceptions.DBException;
import payments.entities.User;
import payments.exceptions.dbExceptions.DBException;

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
    User findUserByClientId(final int clientId) throws DBException;

}
