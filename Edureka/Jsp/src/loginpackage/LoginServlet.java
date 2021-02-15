package loginpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static PreparedStatement pst = null;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "password");
			pst = con.prepareStatement("select * from user_pass");

			pst = con.prepareStatement("select * from user_pass where name=? and password=?");
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the form data
		PrintWriter out = response.getWriter();
		String uid = request.getParameter("username");
		String pwd = request.getParameter("password");
		
		try {
			pst.setString(1, uid);
			pst.setString(2, pwd);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				//RequestDispatcher rd = request.getRequestDispatcher("admin");
				//rd.forward(request, response);
				out.print("<p style=font-size:18px;color:green;text-align:center>valid user");
				
			}
			else {		
				response.setContentType("text/html");
				
				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
				rd.include(request, response);				
				out.println("<p style=font-size:18px;color:red;text-align:center>Invalid Username/ Password.. Try Again");
			}
		}catch(Exception ex) {ex.printStackTrace();
		}
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
}
