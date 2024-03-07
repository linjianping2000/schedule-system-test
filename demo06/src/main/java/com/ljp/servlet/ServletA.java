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
@WebServlet(urlPatterns = "/servletA")
public class ServletA extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //向请求域中存放数据
        req.setAttribute("request","requestMessage");

        //向会话域中存放数据
        HttpSession session = req.getSession();
        session.setAttribute("session","sessionMessage");

        //向应用域存放数据
        ServletContext application = getServletContext();
        application.setAttribute("application","applicationMessage");

        //获取请求域中数据
        String requestMessage = (String) req.getAttribute("request");
        System.out.println("请求域:" + requestMessage);

        //请求转发
        req.getRequestDispatcher("servletB").forward(req,resp);
    }
}
