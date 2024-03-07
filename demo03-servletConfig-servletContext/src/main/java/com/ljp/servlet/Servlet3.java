package com.ljp.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * @author 林健平
 * @version 1.0
 * @create 2024/2/28
 * @Description
 */
@WebServlet(urlPatterns = "/servlet3")
public class Servlet3 extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();

        //获取一个指向项目部署位置下的某个文件/目录的磁盘真实路径的API
        String path = servletContext.getRealPath("upload");
        System.out.println(path);

        //获取项目的上下文路径 项目的访问路径

        String contextPath = servletContext.getContextPath();
        System.out.println(contextPath);
    }
}
