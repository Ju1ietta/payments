package payments.commands;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class CommandContainer {
    /**
     * LOG for this class.
     */
    private static final Logger LOG = Logger.getLogger(CommandContainer.class);

    private static Map<String,Command> commands = new HashMap<>();

    static {
        // common commands
        commands.put("selectLocale", new SelectLocaleCommand());

        commands.put("login",        new LoginCommand());
        commands.put("logout",       new LogoutCommand());

        commands.put("noCommand",    new NoCommand());
        commands.put("registerPage", new RegisterPageCommand());
        commands.put("errorPage",    new ErrorPageCommand());

        commands.put("registerUser", new RegisterUserCommand());
        commands.put("toLoginPage",  new LoginPageCommand());
    }
    /**
     * Returns command object with the given name.
     *
     * @param commandName
     * @return Command object.
     */
    public static Command get(String commandName) {
        if (commandName == null || !commands.containsKey(commandName)) {
            LOG.trace("Command not found, name --> " + commandName);
            return commands.get("noCommand");
        }
        return commands.get(commandName);
    }
}
