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

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import edu.java.test.dataaccessobject.EmployeeDAO;

/**
 * Servlet implementation class DeleteFromAddressBook
 */
@WebServlet("/DeleteFromAddressBook")
public class DeleteFromAddressBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Logger log = Logger.getLogger(AddressBookDetails.class);

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PropertyConfigurator.configure(this.getClass().getClassLoader()
				.getResource("log4j.properties"));

		String firstName = request.getParameter("firstName");

		int id = Integer.parseInt(request.getParameter("id"));

		EmployeeDAO employeeDAO = new EmployeeDAO();
		log.info("Deleting employee...");
		int status = employeeDAO.deleteEmployee(firstName, id);
		try {
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
