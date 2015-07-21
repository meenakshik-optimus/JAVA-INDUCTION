package ServletPackage;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("Name");
		String pass = request.getParameter("Password");

		if ((name.equals("mixi") && pass.equals("mixi"))
				|| (name.equals("meenu") && pass.equals("meenu"))) {
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
