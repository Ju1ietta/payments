package payments.managers;


import payments.common.Messages;
import payments.utilities.LogUtility;

import payments.common.Messages;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class ConnectionManager {
    /**
     * Close connection
     * @param connection
     */
    private static void close(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                LogUtility.exception(Messages.ERR_CANNOT_CLOSE_CONNECTION,e);
            }
        }
    }

    /**
     * Closes a statement object.
     * @param stmt
     */
    private static void close(Statement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                LogUtility.exception(Messages.ERR_CANNOT_CLOSE_STATEMENT, e);
            }
        }
    }

    /**
     * Closes a result set object.
     */
    private static void close(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                LogUtility.exception(Messages.ERR_CANNOT_CLOSE_RESULTSET, e);
            }
        }
    }

    /**
     * Closes resources.
     */
    public static void close(ResultSet rs, Statement stmt, Connection con) {
        close(rs);
        close(stmt);
        close(con);
    }

    /**
     * Rollbacks a connection.
     *
     * @param con Connection to be rollbacked.
     */
    public static void rollback(Connection con) {
        if (con != null) {
            try {
                con.rollback();
            } catch (SQLException e) {
                LogUtility.exception(Messages.ERR_CANNOT_ROLLBACK_CONNECTION, e);
            }
        }
    }
}
