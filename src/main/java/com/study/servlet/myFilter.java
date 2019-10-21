package com.study.servlet;

import com.study.controller.HelloController;
import org.springframework.context.annotation.ComponentScan;
import org.w3c.dom.html.HTMLParagraphElement;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@ComponentScan
@WebFilter("/*")
public class myFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig){
        System.out.println("myFilter:   init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("myFilter:    doFilter");
        //打印http请求相关信息
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        System.out.println(httpServletRequest.toString());
        System.out.println(httpServletRequest.getHeader("Accept"));
        System.out.println(httpServletRequest.getHeader("Referer"));
        System.out.println(httpServletRequest.getHeader("Host"));
        System.out.println(httpServletRequest.getHeader("code"));
        System.out.println(httpServletRequest.getHeader("Origin"));
        System.out.println(httpServletRequest.getHeader("Accept-Language"));
        System.out.println(httpServletRequest.getHeader("Content-Type"));


        //打印http响应信息
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        System.out.println(httpServletResponse.getHeader("Server"));
        System.out.println(httpServletResponse.getHeader("Date"));
        System.out.println(httpServletResponse.getHeader("Access-Control-Allow-Origin"));
        System.out.println(httpServletRequest.getSession());
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("myFilter:   destroy");
    }
}
