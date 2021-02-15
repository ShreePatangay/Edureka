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

import entity.Statement;
import model.CustomerDao;
import model.StatementDao;

/**
 * Servlet implementation class DisplayStatement
 */
@WebServlet("/display")
public class DisplayStatement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayStatement() {
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
		// TODO Auto-generated method stub
		//doGet(request, response);
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		StatementDao dao = (StatementDao) context.getBean("statementdao");

		//doGet(request, response);
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = request.getRequestDispatcher("displaystatement.jsp");
		rd.include(request, response);	
		out.println("<table style='border:1px solid black'><tr><th style='border:1px solid black'>S.NO</th><th style='border:1px solid black'>Date</th><th style='border:1px solid black'>Description</th><th style='border:1px solid black'>Cheque No</th><th style='border:1px solid black'>Withdraw</th><th style='border:1px solid black'>Deposit</th><th style='border:1px solid black'>Available Balance</th></tr>");
		for(Statement s: dao.getStatement()) {
			out.println("<tr><td style='border:1px solid black'>"+s.getSno()+"</td><td style='border:1px solid black'>"+s.getDot()+"</td><td style='border:1px solid black'>"+s.getDesc()+"</td><td style='border:1px solid black'>"+s.getCheque()+"</td><td style='border:1px solid black'>"+s.getWithdraw()+"</td><td style='border:1px solid black'>"+s.getDeposit()+"</td><td style='border:1px solid black'>"+s.getBalance()+"</td></tr>");
		}
		out.println("</table>");
	}
	}


