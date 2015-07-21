package ServletPackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HitCount
 */
@WebServlet("/HitCount")
public class HitCount extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		String name = request.getParameter("Name");
		Integer count = (Integer) session.getAttribute(name);
		if (count == null) {
			count = new Integer(1);
		} else {
			count = new Integer(count.intValue() + 1);
		}
		session.setAttribute(name, count);

		/**
		 * Display the hit count for this page
		 */

		out.println("You've logged in your account " + count
				+ ((count.intValue() == 1) ? " time" : " times"));

	}

}
