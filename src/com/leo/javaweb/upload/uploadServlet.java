package com.leo.javaweb.upload;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class uploadServlet
 */
@WebServlet("/uploadServlet")@MultipartConfig
public class uploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public uploadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Part part=request.getPart("photo");
		if(part!=null&&part.getSubmittedFileName().length()>0){
			String savaPath=request.getServletContext().getRealPath("/upload");
			part.write(savaPath+"/"+part.getSubmittedFileName());
			request.setAttribute("hint", "success");
		}else{
			request.setAttribute("hint", "error");
		}
		request.getRequestDispatcher("upload/index.jsp").forward(request, response);
	}

}
