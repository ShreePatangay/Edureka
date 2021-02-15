package apps;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Admin;
import model.AdminDao;

/**
 * Servlet implementation class DebitOperation
 */
@WebServlet("/debitfrom")
public class DebitOperation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DebitOperation() {
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
		PrintWriter out = response.getWriter();
		//doGet(request, response);
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		AdminDao dao = (AdminDao) context.getBean("admindao");
		int accno = Integer.parseInt(request.getParameter("accno"));
		Admin ad= dao.getAdmin(accno);
		float amount = Float.parseFloat(request.getParameter("amt"));
		ad.setBalance(ad.getBalance()+amount);
		dao.updateAdmin(ad);
		
		response.setContentType("text/html");
		
		out.println("<p style=font-size:18px;color:green;text-align:center>debitted amount:"+amount+" to account no:"+ad.getAcno()+" succesfully! main balance:"+ad.getBalance());
}

}
