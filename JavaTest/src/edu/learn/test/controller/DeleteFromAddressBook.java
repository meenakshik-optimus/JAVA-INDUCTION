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
 * Servlet implementation class DeleteFromAddressBook
 */
@WebServlet("/DeleteFromAddressBook")
public class DeleteFromAddressBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteFromAddressBook() {
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
String firstName = request.getParameter("firstName");

int id = Integer.parseInt(request.getParameter("id"));
System.out.println(id);
EmployeeDAO employeeDAO=new EmployeeDAO();
int status=employeeDAO.deleteEmployee(firstName,id);
try{
if (status == 1) {
	PrintWriter out = response.getWriter();
	out.println("Employee deleted");

	

	RequestDispatcher requestDispatcher = request
			.getRequestDispatcher("/adminaccessibledetail.jsp");
	requestDispatcher.include(request, response);
} else {
	PrintWriter out = response.getWriter();
	out.println("Try again");
	RequestDispatcher requestDispatcher = request
			.getRequestDispatcher("/deleteAddressBook.jsp");
	requestDispatcher.include(request, response);
	
}
} catch (MalformedURLException exception) {

exception.printStackTrace();

} catch (IOException exception) {

exception.printStackTrace();
}
	}

}
