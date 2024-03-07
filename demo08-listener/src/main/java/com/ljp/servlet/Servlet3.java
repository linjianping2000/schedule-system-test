package com.ljp.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 林健平
 * @version 1.0
 * @create 2024/3/5
 * @Description
 */
@WebServlet(value = "/servlet3")
public class Servlet3 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //移除数据
        ServletContext servletContext = getServletContext();

        servletContext.removeAttribute("key1");
    }
}
