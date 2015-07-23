package edu.javalearn.domain.webhibernate;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.javalearn.domain.hibernatedataaccess.UserDataAccess;
import edu.javalearn.domain.hibernateBean.User;

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
			List<User> userList = userDataAccess.getUserList();
			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher("/UserDetails.jsp");
			request.setAttribute("UserDetails", userList);
			requestDispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
