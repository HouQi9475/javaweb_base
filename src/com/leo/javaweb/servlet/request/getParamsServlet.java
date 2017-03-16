package com.leo.javaweb.servlet.request;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class getParamsServlet
 */
@WebServlet("/getParamsServlet")
public class getParamsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getParamsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(request.getParameter("xxx"));
		System.out.println(request.getParameter("yyy"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(request.getParameter("username"));
		System.out.println(request.getParameter("password"));
		String[] hobby=request.getParameterValues("hobby");
		System.out.println(Arrays.toString(hobby));
		//获取所有请求参数的name
		Enumeration names=request.getParameterNames();
		while(names.hasMoreElements()){
			System.out.println(names.nextElement());
		}
		//获取所有请求参数，封装到map中
		Map<String,String[]> params=(Map<String, String[]>) request.getParameterMap();
		for (String key : params.keySet()) {
			String[] name=params.get(key);
			System.out.println(key+"="+Arrays.toString(name));
		}
	}

}
