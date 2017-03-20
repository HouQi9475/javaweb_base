package com.leo.javaweb.servletCharset;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CharsetServlet
 */
@WebServlet("/CharsetServlet")
public class CharsetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CharsetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * request方法
	 * 1，先获取错误的iso编码
	 * 2，然后反编码
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		/*byte[] bytes=username.getBytes();
		username=new String(bytes,"utf-8");*/
		System.out.println("getUsername="+username);
	}

	/**
	 * post方法
	 *1，先设置request.setCharacterEncoding("utf-8")
	 *2,在调用request.getParameter("username")
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String username=request.getParameter("username");
		System.out.println("postUsername="+username);
	}

}
