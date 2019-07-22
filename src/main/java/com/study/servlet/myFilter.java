package com.study.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//
@WebFilter("/*")
public class myFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig){
        System.out.println("myFilter:   init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("myFilter:    doFilter");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("myFilter:   destroy");
    }
}
