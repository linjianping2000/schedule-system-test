package com.ljp.servlet;

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
@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收参数
        String username = req.getParameter("username");

        //做出响应
        resp.getWriter().write("hello" + username);
    }
}
