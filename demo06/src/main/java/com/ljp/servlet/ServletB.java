package com.ljp.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author 林健平
 * @version 1.0
 * @create 2024/3/4
 * @Description
 */
@WebServlet(urlPatterns = "/servletB")
public class ServletB extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求域中的数据
        String requestMessage = (String) req.getAttribute("request");
        System.out.println("请求域:" + requestMessage);

        //获取会话域中的数据
        HttpSession session = req.getSession();
        String sessionMessage = (String) session.getAttribute("session");
        System.out.println("会话域:" + sessionMessage);

        //获取应用域中的数据
        ServletContext application = getServletContext();
        String applicationMessage = (String) application.getAttribute("application");
        System.out.println("应用域:" + applicationMessage);
    }
}
