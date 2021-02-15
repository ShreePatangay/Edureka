package apps;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.CreditCard;
import model.CreditCardDao;
import model.CustomerDao;

/**
 * Servlet implementation class CreditCardOperations
 */
@WebServlet("/creditcard")
public class CreditCardOperations extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreditCardOperations() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		CreditCardDao dao = (CreditCardDao) context.getBean("ccdao");
		PrintWriter out = response.getWriter();
		String creditcard = request.getParameter("cardno");
		float amount = Float.parseFloat(request.getParameter("amt"));

		for (CreditCard cc : dao.getCreditCards()) {
			if (cc.getCno() == creditcard) {
				if (amount < 100000) {
					cc.setBalance(cc.getBalance() - amount);
					dao.updateCreditCard(cc);
					RequestDispatcher rd = request.getRequestDispatcher("authorize.jsp");
					rd.include(request, response);

					out.println("loan approved of amount:" + amount + " to credit card with number:" + cc.getCno()
							+ " main balance:" + cc.getBalance());

				}else {
					RequestDispatcher rd = request.getRequestDispatcher("authorize.jsp");
					rd.include(request, response);
					out.println("<p style=font-size:18px;color:red;text-align:center>Could not approve credit Loan");
				}
			}
		}
	}
}
