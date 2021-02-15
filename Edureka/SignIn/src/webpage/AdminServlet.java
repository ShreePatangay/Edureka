package webpage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/admin")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body style=background:lightgreen;text-align:center>");
		out.println("<h1>Login Succesfull</h1>");
		out.println("<hr>");
		out.println("<p style=text-align:left>Username is "+ request.getParameter("name")+"</p><hr>");
		out.println("<p style=text-align:left>Password is "+ request.getParameter("password")+"</p><hr>");
		
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uName = request.getParameter("name");
		String pWord = request.getParameter("password");
		Cookie userName = new Cookie("UserName",uName);
		Cookie passWord = new Cookie("PassWord",pWord);
		response.addCookie(userName);
		response.addCookie(passWord);
			
		doGet(request, response);
		
	}

}

