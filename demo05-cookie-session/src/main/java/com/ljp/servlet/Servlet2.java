package com.ljp.servlet;

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
 * @create 2024/3/3
 * @Description
 */
@WebServlet(urlPatterns = "/servlet2")
public class Servlet2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取session对象
        HttpSession session = req.getSession();
        System.out.println(session.getId());
        System.out.println(session.isNew());

        //读出session中的数据
        String username = (String) session.getAttribute("username");
        System.out.println("servlet2 got username:" + username);
    }
}
