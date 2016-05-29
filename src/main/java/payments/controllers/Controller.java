package payments.controllers;

import exceptions.AppException;
import org.apache.log4j.Logger;
import payments.commands.Command;
import payments.commands.CommandContainer;
import payments.common.Constants;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Controller extends HttpServlet {
    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = -54658196193101375L;
    /**
     * LOG for this class.
     */
    private static final Logger LOG = Logger.getLogger(Controller.class);

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     * @param request
     *            request
     * @param response
     *            response
     * @throws ServletException
     *             ServletException
     * @throws IOException
     *             IOException
     *
     */
    public final void doGet(final HttpServletRequest request,
                            final HttpServletResponse response) throws ServletException,
            IOException {
        LOG.info("===================GET works");

        process(request, response, Constants.ACTION_FORWARD);

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     * @param request
     *            request
     * @param response
     *            response
     * @throws ServletException
     *             ServletException
     * @throws IOException
     *             IOException
     */
    public final void doPost(final HttpServletRequest request,
                             final HttpServletResponse response) throws ServletException,
            IOException {
        LOG.info("=============POST works");
        process(request, response, Constants.ACTION_REDIRECT);
    }

    /**
     * Main method of this controller.
     *
     * @param request
     *            request.
     * @param response
     *            response.
     * @param action
     *            action-forward or redirect.
     */
    private void process(final HttpServletRequest request,
                         final HttpServletResponse response, final String action)
            throws IOException, ServletException {

        LOG.info("Controller starts");

        LOG.info("Action " + action);

        String commandName;

        boolean allowed = (boolean) request.getAttribute("allowed");
        System.out.println("allowed " + allowed);
        if (allowed) {
            // extract command name from the request
            commandName = request.getParameter("command");

        } else {
            commandName = "errorPage";
        }

        LOG.info("Request parameter: command --> " + commandName);

        // obtain command object by its name
        Command command = CommandContainer.get(commandName);
        LOG.info("Obtained command --> " + command);

        // execute command and get forward address

        String path = null;
        try {
            path = command.execute(request, response, action);

        } catch (AppException e) {

            // write info to session
            HttpSession session = request.getSession(false);
            session.setAttribute(Constants.ERROR_MESSAGE, e.getMessage());

            // define path as command
            path = request.getContextPath() + command.getCommandPerform();
        }

        LOG.trace("Obtained path --> " + path);

        if (path == null) {

            LOG.trace("Controller proccessing finished");

        } else {
            if (action.equals(Constants.ACTION_FORWARD)) {
                LOG.info("Forward to address = " + path);
                LOG.info("Controller proccessing finished");
                RequestDispatcher disp = request.getRequestDispatcher(path);
                disp.forward(request, response);
            } else if (action.equals(Constants.ACTION_REDIRECT)) {
                LOG.info("Redirect to address = " + path);
                LOG.info("Controller proccessing finished");
                response.sendRedirect(path);
            }
        }

    }

}
