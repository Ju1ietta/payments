package payments.listener;

import payments.utilities.LogUtility;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        HttpSession session = httpSessionEvent.getSession();
        LogUtility.info("Session with id = " + session.getId() + " started.");
        session.setMaxInactiveInterval(600);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        HttpSession session = httpSessionEvent.getSession();
        LogUtility.info("Session with id = " + session.getId() + " ended.");
    }
}
