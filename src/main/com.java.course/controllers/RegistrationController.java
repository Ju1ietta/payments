package main.com.java.course.controllers;

import main.com.java.course.dao.UserDAO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Регистрация нового пользователя в систему
 * @author Yulia
 * @since 05.05.2016.
 */
@WebServlet(urlPatterns = "/registration")
public class RegistrationController extends HttpServlet{
    private static String INSERT = "/registration.jsp";
    private UserDAO dao;

    /**
     * Конструктор создает объект класса UserDAO для отправки запросов в БД
     * @see UserDAO
     */
    public RegistrationController() {
        super();
        dao = new UserDAO();
    }

}
