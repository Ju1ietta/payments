package payments.utilities;

import org.apache.log4j.Logger;

public final class LogUtility {
    private final static Logger logger = Logger.getLogger(LogUtility.class);

    private LogUtility() {
    }

    public static void info(final String message) {
        logger.info(message);
    }

    public static void warning(final String message) {
        logger.warn(message);
    }

    public static void error(final String message) {
        logger.error(message);
    }

    public static void exception(final String message, final Throwable t) {
        logger.error(message, t);
    }
}