package com.ljp.schedule.filter;



import com.ljp.schedule.pojo.SysUser;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
//                          showSchedule.html
@WebFilter(urlPatterns = {"/showSchedule.html","/schedule/*"})
public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 参数父转子
        HttpServletRequest request =(HttpServletRequest)  servletRequest;
        HttpServletResponse response  =(HttpServletResponse) servletResponse;
        // 获得session域对象
        HttpSession session = request.getSession();
        // 从session域中获得登录的用户对象
        SysUser sysUser = (SysUser)session.getAttribute("sysUser");
        // 判断用户对象是否为空
        if(null == sysUser){
            // 没登录 到login.html
            response.sendRedirect("/login.html");
        }else{
            // 登录过 放行
            filterChain.doFilter(request,response);
        }
    }

    @Override
    public void destroy() {

    }
}
