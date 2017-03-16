package com.leo.javaweb.servletInclude;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 第一次请求的servlet，包含第二个servlet。响应头保留，响应体保留 Servlet implementation class
 * OneServlet
 */
@WebServlet("/ThreeServlet")
public class ThreeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("ThreeServlet");
		response.setHeader("head", "i am head");
		response.getWriter().print("i am ThreeServlet");
		request.getRequestDispatcher("/FourServlet").include(request, response);
	}
}
