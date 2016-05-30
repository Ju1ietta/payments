package payments.common;

public final class Constants {
    public final static String APPLICATION_NAME = "/Payments/";
    // Commands
    public final static String COMMAND_LOGIN  = "/controller?command=login";
    public final static String COMMAND_LOGOUT = "/controller?command=logout";

    // Actions
    public final static String ACTION_REDIRECT = "redirect";
    public final static String ACTION_FORWARD  = "forward";

    // Error message
    public final static String ERROR_MESSAGE      = "errorMessage";
    public final static String COMMAND_ERROR_PAGE = "/controller?command=errorPage";
    public final static String PAGE_ERROR_PAGE    = "/WEB-INF/jsp/error.jsp";

    // I18nTag default locale
    public final static String LOCALE_DEFAULT = "en_US";
    public final static String LOCALE_RU      = "ru_RU";
    public final static String LOCALE_EN      = "en_US";

    // States of client
    public final static String CLIENT_UNLOCKED = "clientUnlocked";
    public final static String CLIENT_LOCKED   = "clientLocked";

    // Roles
    public final static String ADMIN  = "ADMIN";
    public final static String CLIENT = "CLIENT";

}
