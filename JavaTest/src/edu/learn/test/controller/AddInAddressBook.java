package edu.learn.test.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.java.test.dataaccessobject.EmployeeDAO;

/**
 * Servlet implementation class AddInAddressBook
 */
@WebServlet("/AddInAddressBook")
public class AddInAddressBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddInAddressBook() {
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
		try{
			int status=0;
		String firstName = request.getParameter("firstName");

		

		String lastName = request.getParameter("lastName");
		String address = request.getParameter("address");
		String emailAddress = request.getParameter("emailAddress");
		
		String phoneNumber = request.getParameter("phoneNumber");
		
		EmployeeDAO employeeDAO=new EmployeeDAO();
		status=employeeDAO.addEmployee(firstName,lastName,address,phoneNumber,emailAddress);
		if (status == 1) {
			PrintWriter out = response.getWriter();
			out.println("Employee added");

			

			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher("/adminaccessibledetail.jsp");
			requestDispatcher.include(request, response);
		} else {
			PrintWriter out = response.getWriter();
			out.println("Try again");
			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher("/addEmployee.jsp");
			requestDispatcher.include(request, response);
			
		}
	} catch (MalformedURLException exception) {

		exception.printStackTrace();

	} catch (IOException exception) {

		exception.printStackTrace();
	}
	}

}
