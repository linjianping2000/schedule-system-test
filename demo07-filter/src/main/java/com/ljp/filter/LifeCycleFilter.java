package com.ljp.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author 林健平
 * @version 1.0
 * @create 2024/3/4
 * @Description
 */
public class LifeCycleFilter implements Filter {

    public LifeCycleFilter(){
        System.out.println("构造器");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("放行");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("销毁");
    }
}
