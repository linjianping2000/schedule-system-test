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
 * @create 2024/3/1
 * @Description
 */
@WebServlet("/servlet6")
public class servlet6 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应行相关的api
        resp.setStatus(405);
        //设置响应头相关的api
        resp.setContentType("text/html");

    }
}
