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
@WebServlet(urlPatterns = "/servlet1")
public class Servlet1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收请求中username参数
        String username = req.getParameter("username");
        //获取一个session对象
        HttpSession session = req.getSession();

        //将username存入session
        session.setAttribute("username",username);

        //客户端响应信息
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("成功");
    }
}
