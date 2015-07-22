package edu.javalearn.domain.webhibernate;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.javalearn.domain.hibernatedataaccess.UserDataAccess;

/**
 * Servlet implementation class Register
 */
@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String UserName = request.getParameter("UserName");
		String Password = request.getParameter("Password");

		HttpSession session = request.getSession(true);
		try {
			UserDataAccess userDataAccess = new UserDataAccess();
			userDataAccess.addUserDetails(UserName, Password);
			userDataAccess.retrieve();
			response.sendRedirect("successRegistration");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
