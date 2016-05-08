package payments.common;

public final class Queries {
    public  static final String SQL_UPDATE_USER_STATE_BY_CLIENT_ID  = "UPDATE users SET state_id=? WHERE client_id=?";
    public  static final String SQL_FIND_USER_BY_CLIENT_ID          = "SELECT * FROM users WHERE id=?";
    public  static final String SQL_FIND_USERS_BY_ROLE_ID           = "SELECT * FROM users WHERE role_id=?";
    public  static final String SQL_FIND_USER_BY_LOGIN              = "SELECT * FROM users WHERE login=?";
    public  static final String SQL_DELETE_USER_BY_ID               = "DELETE FROM users WHERE id=?";
    public  static final String SQL_ADD_USER                        = "INSERT INTO users (client_id, login, password, role_id, state_id) "
            + "VALUES(?,?,?,?,?);";
}
