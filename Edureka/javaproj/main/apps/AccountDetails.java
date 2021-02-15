package apps;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Customer;
import model.CustomerDao;

/**
 * Servlet implementation class AccountDetails
 */
@WebServlet("/account")
public class AccountDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		CustomerDao dao = (CustomerDao) context.getBean("cusdao");

		//doGet(request, response);
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String dob = request.getParameter("dob");
		String address = request.getParameter("address");
		String email = request.getParameter("eid");
		String acctype = request.getParameter("acctype");
		
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
		java.util.Date udate = null;
		try {
			udate = sdf.parse(dob);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		long li = udate.getTime();
		java.sql.Date sqlDate = new java.sql.Date(li);
		
		Customer c1 = new Customer(name,sqlDate,address,email,acctype);
		dao.saveCustomer(c1);
		
		if(dao.getCustomer(c1.getUno())!=null) {
			response.setContentType("text/html");
			
			RequestDispatcher rd = request.getRequestDispatcher("mainmenu.jsp");
			rd.include(request, response);				

			out.println("<p style=font-size:18px;color:green;text-align:center>Account is created with id: "+c1.getUno());
			
		}else {
			response.setContentType("text/html");
			
			RequestDispatcher rd = request.getRequestDispatcher("account.jsp");
			rd.include(request, response);				

			out.println("<p style=font-size:18px;color:red;text-align:center>User Account is not created");

		}
	}

}
