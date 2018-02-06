package com.hcht.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * Created by mather on 2018/2/6.
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LocalDateTime currentTime = LocalDateTime.now();
        req.setAttribute("currentTime",currentTime.toString() + "; 睡觉！！！");
        req.getRequestDispatcher("/WEB-INF/webpage/hello.jsp").forward(req,resp);
    }
}
