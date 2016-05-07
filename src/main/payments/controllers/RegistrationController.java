package main.payments.controllers;


import main.payments.dao.UserDAO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Регистрация нового пользователя в систему
 * @author Yulia
 * @since 05.05.2016.
 */
@WebServlet(urlPatterns = "/index")
public class RegistrationController extends HttpServlet{
    private static String INSERT = "/index.jsp";
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
