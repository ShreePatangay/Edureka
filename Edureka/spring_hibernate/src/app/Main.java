package app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmployeeDao;
import entity.Employee;

public class Main {

	int grossSalary;
	int netSalary;

	public Main() {
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		EmployeeDao dao = (EmployeeDao) context.getBean("empdao");
		//Employee noobEmp = new Employee(111,"jenny",10002);
		//dao.saveEmployee(noobEmp);
		//dao.deleteEmployee(noobEmp);
		
		Employee e = new Employee();
		List<Employee> emps = dao.getEmployees();
		for (int i = 0; i < emps.size(); i++) {
			e = emps.get(i);
			dao.calc(e);
			int grossSalary = e.getBasic()+e.getHra()+e.getDa();
			int netSalary = grossSalary-((int)(0.1*grossSalary)+e.getDeductions());
			System.out.println(e+" GrossSalary: "+grossSalary+" NetSalary: "+netSalary);
		}
	}

}
