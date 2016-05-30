package payments.commands;

import payments.exceptions.AppException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutCommand extends Command {
    /**
     * Execution method for command.
     *
     * @param req
     * @param res
     * @param action
     * @return Address to go once the command is executed
     * @throws AppException
     */
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res, String action) throws AppException {
        return null;
    }

    /**
     * Gets command name as request string.
     *
     * @return request string.
     */
    @Override
    public String getCommandPerform() {
        return null;
    }
}
