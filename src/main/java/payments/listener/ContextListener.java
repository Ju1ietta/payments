package payments.listener;


import payments.utilities.LogUtility;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListener  implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        LogUtility.info("Servlet context was started");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        LogUtility.info("Servlet context was stopped");
    }
}
