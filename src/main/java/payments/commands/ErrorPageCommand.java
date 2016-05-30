package payments.commands;

import org.apache.log4j.Logger;
import payments.common.Constants;
import payments.exceptions.AppException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorPageCommand extends Command {
    /**
     * Forward address.
     */
    private String forward = Constants.PAGE_ERROR_PAGE;
    /**
     * Performed command.
     */
    private static final String COMMAND_PERFORM = Constants.COMMAND_ERROR_PAGE;
    /**
     * LOG for this class.
     */
    private static final Logger LOG = Logger.getLogger(ErrorPageCommand.class);

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
        if (action.equals(Constants.ACTION_REDIRECT)) {
            LOG.debug("Command started");
            forward = Constants.PAGE_ERROR_PAGE;
            LOG.debug("Command finished");
            return req.getContextPath() + COMMAND_PERFORM;
        } else if (action.equals(Constants.ACTION_FORWARD)) {
            return forward;
        }
        return forward;
    }

    /**
     * Gets command name as request string.
     *
     * @return request string.
     */
    @Override
    public String getCommandPerform() {
        return COMMAND_PERFORM;
    }
}
