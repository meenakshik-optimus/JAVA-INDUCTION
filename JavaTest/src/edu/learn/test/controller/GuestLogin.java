package edu.learn.test.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import edu.java.test.dataaccessobject.GuestDAO;


/**
 * Servlet implementation class GuestLogin
 */
@WebServlet("/guestLogin")
public class GuestLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuestLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		String guestName = request.getParameter("guestName");
		String password= request.getParameter("password");
		try {
			
			GuestDAO guestDAO = new GuestDAO();
			
			guestDAO.addGuestDetails(guestName,password);
			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher("/guestaccessibledetail.jsp");
			requestDispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
