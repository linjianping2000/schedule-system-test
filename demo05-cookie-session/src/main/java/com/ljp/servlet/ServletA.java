package com.ljp.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 林健平
 * @version 1.0
 * @create 2024/3/3
 * @Description
 */
@WebServlet(urlPatterns = "/servletA")
public class ServletA extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie key1 = new Cookie("key1", "value1");
        Cookie key2 = new Cookie("key2", "value2");
        //设置cookie存活时间
        key1.setMaxAge(60);
        //设置cookie提交路径
        key1.setPath("/d05/servletB");

        resp.addCookie(key1);
        resp.addCookie(key2);
    }
}
