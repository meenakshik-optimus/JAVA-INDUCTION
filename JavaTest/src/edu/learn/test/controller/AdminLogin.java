package edu.learn.test.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.java.test.dataaccessobject.AdminDAO;

/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/adminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adminName = request.getParameter("adminName");	
		String password = request.getParameter("password");
		
		AdminDAO adminDAO=new AdminDAO();
		int status=adminDAO.authenticate(adminName, password);
		
		if(status==1)
		{
			PrintWriter out = response.getWriter();
			out.println("welcome admin");
			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher("/adminaccessibledetail.jsp");
			requestDispatcher.include(request, response);
		}
		else{
			PrintWriter out = response.getWriter();
			out.println("authentication denied");
			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher("/admin.jsp");
			requestDispatcher.include(request, response);
		}
	}

}
