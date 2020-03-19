package org.test.resteasy;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher;

public class Main {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8000);

        ServletContextHandler handler = new ServletContextHandler(ServletContextHandler.NO_SESSIONS);
        ServletHolder servlet = handler.addServlet(HttpServletDispatcher.class, "/");
        servlet.setInitParameter("javax.ws.rs.Application", AppResourceConfig.class.getCanonicalName());

        server.setHandler(handler);

        server.start();
        server.join();
    }
}
