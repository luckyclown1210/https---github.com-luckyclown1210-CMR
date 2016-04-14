/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coursemonitor.filter;

import com.coursemonitor.entity.Staff;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nghia
 */
public class loginFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)request;
        HttpServletResponse res = (HttpServletResponse)response;
        Staff user = (Staff) req.getSession().getAttribute("user");
String uri = req.getRequestURI();
if(user == null)
{
if(uri.indexOf("assignCourse")>=0)
{
res.sendRedirect(req.getServletContext().getContextPath()+"/login.xhtml");
}
}

chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }
    
}
