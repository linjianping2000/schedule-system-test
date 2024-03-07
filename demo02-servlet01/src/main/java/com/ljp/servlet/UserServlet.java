package com.ljp.servlet;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 林健平
 * @version 1.0
 * @create 2024/2/28
 * @Description
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        // 1 从request 对象中获取请求中的任何信息(username参数)
        String username = req.getParameter("username");

        // 2 处理业务的代码
        String info = "YES";
        if ("atguigu".equals(username)){
            info = "NO";
        }

        // 3 将要响应的数据放入response
        PrintWriter writer = res.getWriter(); //返回的是一个向响应体打印字符串的 打印流
        writer.write(info);

    }
}
