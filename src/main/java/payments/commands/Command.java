package payments.commands;

import payments.exceptions.AppException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;

public abstract class Command implements Serializable {
    /**
     * Execution method for command.
     *
     * @param req
     * @param res
     * @return Address to go once the command is executed
     * @throws AppException
     */
    public abstract String execute(HttpServletRequest req, HttpServletResponse res, String action) throws AppException;

    /**
     * Gets command name as request string.
     *
     * @return request string.
     */
    public abstract String getCommandPerform();

    @Override
    public final String toString() {
        return getClass().getSimpleName();
    }


}
