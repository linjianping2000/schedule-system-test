package com.ljp.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 林健平
 * @version 1.0
 * @create 2024/3/1
 * @Description
 */
@WebServlet("/servletA")
public class ServletA extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servletA 执行了");
        String money = req.getParameter("money");
        System.out.println(money);
        //请求转发给servletB
        RequestDispatcher servletB = req.getRequestDispatcher("servletB");
        //让请求转发器做出动作
        servletB.forward(req,resp);
    }
}
