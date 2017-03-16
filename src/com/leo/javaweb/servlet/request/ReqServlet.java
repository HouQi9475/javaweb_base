package com.leo.javaweb.servlet.request;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 获取客户端的IP地址，获取请求方法，得到客户端的信息
 * Servlet implementation class ASservlet
 */
@WebServlet("/ReqServlet")
public class ReqServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("gbk");
		String ip=request.getRemoteAddr();
		System.out.println("ip地址为："+ip);
		String method=request.getMethod();
		System.out.println("请求方法为："+method);
		String agent=request.getHeader("User-Agent");
		System.out.println("请求头为："+agent);
		//Mozilla/5.0 (Windows NT 6.1; WOW64; rv:51.0) Gecko/20100101 Firefox/51.0
	    if(agent.toLowerCase().contains("firefox")){
	    	response.getWriter().println("您好"+ip+",您的浏览器是：火狐");
	    }
	    //获取项目名
	    String name=request.getContextPath();
	    System.out.println("项目名："+name);
	    //获取请求的URL(不包含参数的整个请求路径)
	    StringBuffer url=request.getRequestURL();
	    System.out.println("请求路径："+url);
	    //获取请求uri,等于项目名加servlet
	    String uri=request.getRequestURI();
	    System.out.println("请求URI："+uri);
	    //获取参数部分，即问号后面的部分  ?username=1&password=1
	    String param=request.getQueryString();
	}

}
