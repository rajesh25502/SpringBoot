package com.example.customermanagement.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
public class MyFilter_2 implements Filter
{

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(" MyFilter_2 is called...........");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
