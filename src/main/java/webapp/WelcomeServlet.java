package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
*Browser sends Http Request to Web Server and Web Server responds with Http Response
*
*Servlet is a Java class used to extend the capabilities of servers 
*that host applications accessed by means of a request-response programming model.
*
*To create a servlet Extend javax.servlet.http.HttpServlet, @WebServlet(urlPatterns = "/welcome.do") for url
*and doGet(HttpServletRequest request, HttpServletResponse response) to handle GET request
*/
/**
 * 
 * @author Bhagwati Prasad(bpjoshi)
 *
 */
@WebServlet(urlPatterns = "/welcome.do")
public class WelcomeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Sopra Steria</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("Introduction to Java EE");
		out.println("</body>");
		out.println("</html>");
	}
}