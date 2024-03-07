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
@WebServlet(urlPatterns = "/servletB")
public class ServletB extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //从request中获取cookie
        Cookie[] cookies = req.getCookies();
        //请求中
        if (null != cookies){
            for (Cookie cookie:cookies){
                System.out.println(cookie.getName() + ":" +cookie.getValue());
            }
        }
    }
}
