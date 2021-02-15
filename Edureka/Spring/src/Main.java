import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.DAO;
import dao.EmployeeDao;
import entity.Employee;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		 
		DAO dao=context.getBean("empdao", DAO.class);

		//to save emp data
		Employee emp = new Employee(110,"john marquee",2500);
		dao.saveEmp(emp);
		
		//to get emp
		//dao.getEmployee("john marquee");
		
		}

}
