package com.ljp.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author 林健平
 * @version 1.0
 * @create 2024/3/4
 * @Description
 */
public class LoggingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //请求到达目标资源的方法
        System.out.println("loggingFilter before doFilter invoked");

        //放行
        filterChain.doFilter(servletRequest,servletResponse);

        //响应之前的功能代码
        System.out.println("loggingFilter after doFilter invoked");
    }

    @Override
    public void destroy() {

    }

}
