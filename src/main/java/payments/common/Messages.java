package payments.common;


public final class Messages {
    /* Messages of database exceptions */
    public final static String ERR_CANNOT_INIT_CONNECTION_POOL   = "Cannot init pool of connection";
    public final static String ERR_CANNOT_GET_CONNECTION_FROM_DS = "Cannot get connection from Datasourse";

    public final static String ERR_CANNOT_UPDATE_USER_STATE_BY_CLIENT_ID = "Cannot perform query: update user state by client id";
    public final static String ERR_CANNOT_FIND_USER_BY_CLIENT_ID         = "Cannot perform query: find user by client id";
    public final static String ERR_CANNOT_FIND_USER_BY_ROLE_ID           = "Cannot perform query: find user by role id";
    public final static String ERR_CANNOT_FIND_USER_BY_LOGIN             = "Cannot perform query: find user by login";
    public final static String ERR_CANNOT_DELETE_USER                    = "Cannot perform query: delete user";
    public final static String ERR_CANNOT_ADD_USER                       = "Cannot perform query: add user";

    /*Error messages are connected with close connection etc.*/
    public final static String ERR_CANNOT_ROLLBACK_CONNECTION = "Cannot rollback transaction";
    public final static String ERR_CANNOT_CLOSE_CONNECTION    = "Cannot close connection";
    public final static String ERR_CANNOT_CLOSE_STATEMENT     = "Cannot close statement";
    public final static String ERR_CANNOT_CLOSE_RESULTSET     = "Cannot close resultset";
}
