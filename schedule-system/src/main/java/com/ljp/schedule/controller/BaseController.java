package com.ljp.schedule.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @author 林健平
 * @version 1.0
 * @create 2024/3/2
 * @Description
 */
public class BaseController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //判断增删改查
        String requestURI = req.getRequestURI();
        String[] split = requestURI.split("/");
        String MethodName = split[split.length-1];
        //使用反射 通过方法名获取下面的方法
        Class aClass = this.getClass();
        //获取方法
        try {
            Method declaredMethod = aClass.getDeclaredMethod(MethodName, HttpServletRequest.class, HttpServletResponse.class);

            //暴力破解访问修饰符的限制
            declaredMethod.setAccessible(true);

            //执行方法
            declaredMethod.invoke(this,req,resp);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
