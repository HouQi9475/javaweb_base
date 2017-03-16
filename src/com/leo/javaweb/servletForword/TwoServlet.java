package com.leo.javaweb.servletForword;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 被请求的servlet，成为响应体响应给客户端
 * Servlet implementation class TwoServlet
 */
@WebServlet("/TwoServlet")
public class TwoServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("towServlet");
		response.getWriter().println("i am towServlet");
	}

}
