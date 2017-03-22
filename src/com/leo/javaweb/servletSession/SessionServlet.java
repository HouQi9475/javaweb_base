package com.leo.javaweb.servletSession;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet
 */
@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SessionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//判断验证码是否正确，如果不正确，错误信息写入request.转发到login.jsp
		String vcode=request.getParameter("vcode");
		String session_code=(String) request.getSession().getAttribute("vcode");
		if(!session_code.equalsIgnoreCase(vcode)){
			request.setAttribute("error", "验证码错误!");
			request.getRequestDispatcher("/session/login.jsp").forward(request, response);
			return;
		}
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if (username.equals("houqi") && password.equals("houqi")) {
			//如果登录成功，将用户名保存到cookie中，显示在登录框内
			Cookie cookie=new Cookie("uname", username);
			//设置生命为一天，不然关闭浏览器就没有了
			cookie.setMaxAge(60*60*24);
			response.addCookie(cookie);
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			//request.getRequestDispatcher("/session/succ1.jsp").forward(request, response);
			//重定向到succ1.jsp
			response.sendRedirect("/javaweb_base/session/succ1.jsp");
		} else {
			request.setAttribute("error", "用户名和密码错误！");
			request.getRequestDispatcher("/session/login.jsp").forward(request, response);

		}
	}

}
