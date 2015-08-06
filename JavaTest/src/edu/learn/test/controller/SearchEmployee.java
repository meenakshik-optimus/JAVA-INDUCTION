package edu.learn.test.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.java.test.beans.Employee;
import edu.java.test.dataaccessobject.EmployeeDAO;

/**
 * Servlet implementation class SearchEmployee
 */
@WebServlet("/SearchEmployee")
public class SearchEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchEmployee() {
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
		
		String input = request.getParameter("input");	
			
			EmployeeDAO employeeDAO=new EmployeeDAO();
			employeeDAO.searchEmployee(input);
			//PrintWriter out = response.getWriter();  
			
			List<Employee> list= employeeDAO.getDetails();
			request.setAttribute("list", list);
			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher("/displaybysearch.jsp");
			requestDispatcher.forward(request, response);
	}

}
