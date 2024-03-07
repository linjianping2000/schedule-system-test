package com.ljp.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;

/**
 * @author 林健平
 * @version 1.0
 * @create 2024/3/1
 * @Description
 */
@WebServlet(urlPatterns = "/servlet5")
public class servlet5 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        System.out.println(username);
        String userPwd = req.getParameter("userPwd");
        System.out.println(userPwd);

        //获取所有的参数名
        Enumeration<String> pnames = req.getParameterNames();
        while (pnames.hasMoreElements()){
            String pname = pnames.nextElement();
            String[] values = req.getParameterValues(pname);
            if (values.length>1){
                System.out.println(pname + "=" + Arrays.toString(values));
            }else{
                System.out.println(pname + "=" + values[0]);
            }
        }
    }
}
