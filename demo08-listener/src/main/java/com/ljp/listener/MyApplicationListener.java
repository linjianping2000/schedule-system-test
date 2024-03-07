package com.ljp.listener;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import java.net.SocketTimeoutException;

/**
 * @author 林健平
 * @version 1.0
 * @create 2024/3/5
 * @Description
 */
@WebListener
public class MyApplicationListener implements ServletContextListener, ServletContextAttributeListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        System.out.println(servletContext.hashCode()+"应用域初始化了");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        System.out.println(servletContext.hashCode()+"应用域初销毁了");
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {

    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {

    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {

    }
}
