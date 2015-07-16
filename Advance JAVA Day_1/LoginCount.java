
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 * Servlet implementation class LoginCount
 */
@WebServlet("/LoginCount")
public class LoginCount extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public LoginCount() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("Name");
		String pass = request.getParameter("Password");
		if (name.equals("mixi") && pass.equals("mixi")) {
			RequestDispatcher requestDispathcher = request
					.getRequestDispatcher("HitCount");
			requestDispathcher.forward(request, response);
		} else {
			RequestDispatcher requestDispathcher = request
					.getRequestDispatcher("/Login.html");
			requestDispathcher.include(request, response);
		}
	}

}
