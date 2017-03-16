package com.leo.javaweb.servletForword;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 第一次请求的servlet，转发给第二个servlet。响应头保留，响应体被忽略 Servlet implementation class
 * OneServlet
 */
@WebServlet("/OneServlet")
public class OneServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("oneServlet");
		response.setHeader("head", "i am head");
		response.getWriter().print("i am oneServlet");
		request.getRequestDispatcher("/TwoServlet").forward(request, response);
	}
}
