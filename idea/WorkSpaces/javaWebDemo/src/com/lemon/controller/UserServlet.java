package com.lemon.controller;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import java.io.IOException;

/**
 * @program: javaWebDemo
 * @description
 * @author: NiuBenQi
 * @create: 2020-01-11 10:12
 **/
@WebServlet(name = "UserServlet")
public class UserServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        // 获取请求并相应
        servletResponse.setCharacterEncoding("UTF-8");
        String username = "蝶恋花";
        servletResponse.getWriter().append(username);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        // 作用是销毁对象
    }
}
