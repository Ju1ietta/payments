package payments.controllers;

import payments.entities.User;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Servlet extends HttpServlet {

    private String message;
    DataSource dataSource = null;

    public void init() throws ServletException {

        try {
            Context initContext = new InitialContext();
            dataSource = (DataSource) initContext.lookup("java:/comp/env/jdbc/Payments");
        } catch (NamingException e) {
            e.printStackTrace();
        }
        // Do required initialization
        message = "Hello World";
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");
        try {
            showUsers(out);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void showUsers(PrintWriter out) throws SQLException {
        Statement statement = null;
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();
            String sql = "SELECT * FROM users WHERE id=1";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                User user = new User(resultSet);
                out.print("id " + user.getId() + "<br>");
                out.print("Name " + user.getName() + "<br>");
                out.print("Surname " + user.getSurname() + "<br>");
                out.print("E-mail " + user.geteMail() + "<br>");
                out.print("Role " + user.getRole() + "<br>");
                out.print("Dob " + user.getDob() + "<br>");
                out.print("Password " + user.getPassword() + "<br>");
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
