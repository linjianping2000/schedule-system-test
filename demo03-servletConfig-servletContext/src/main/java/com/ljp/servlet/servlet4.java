package com.ljp.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
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
@WebServlet(urlPatterns = "/servlet4")
public class servlet4 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getMethod()); //获取请求方式
        System.out.println(req.getScheme()); //获取请求协议
        System.out.println(req.getProtocol()); //获取请求协议及版本
        System.out.println(req.getRequestURI()); //获取请求的uri 项目内的资源路径
        System.out.println(req.getRequestURL()); //获取请求的url 项目内资源的完整的路径

        System.out.println(req.getLocalPort()); //本应用容器的端口号 8080
        System.out.println(req.getServerPort());//客户端发请求时的端口号
        System.out.println(req.getRemotePort());//客户端软件的端口号

    }
}
