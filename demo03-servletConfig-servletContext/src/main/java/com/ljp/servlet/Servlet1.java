package com.ljp.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author 林健平
 * @version 1.0
 * @create 2024/2/28
 * @Description
 */
@WebServlet(urlPatterns = "/servlet1")
public class Servlet1 extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        //
        ServletContext servletContext = getServletContext();

        //
        String encoding = servletContext.getInitParameter("encoding");
        System.out.println("encoding" + encoding);

        Enumeration<String> initParameterNames = servletContext.getInitParameterNames();
        while (initParameterNames.hasMoreElements()){
            String name = initParameterNames.nextElement();
            System.out.println(name + "=" + servletContext.getInitParameter(name));
        }
    }
}
