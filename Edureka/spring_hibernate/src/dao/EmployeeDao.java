package dao;

import entity.Employee;
import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import entity.Employee;

public class EmployeeDao {
		private Employee emp;
		private HibernateTemplate template;

		public HibernateTemplate getTemplate() {
			return template;
		}

		public void setTemplate(HibernateTemplate template) {
			this.template = template;
		}

		@Transactional(readOnly = false)
		public void saveEmployee(Employee e){  
			System.out.println("Saved Employee: "+e);
		    template.save(e);  
		}  
		@Transactional(readOnly = false)
		public void updateEmployee(Employee e){  
		    System.out.println("Updated Employee Details: "+e);
			template.update(e);  
		}  
		@Transactional(readOnly = false)
		public void deleteEmployee(Employee e){  
			System.out.println("Deleted Employee: "+e);
		    template.delete(e);  
		}  

		public Employee getById(int id){  
		    Employee e=(Employee)template.get(Employee.class,id);  
		    return e;  
		}  

		public void calc(Employee emp) {	 
			if (emp.getBasic() >= 15000) {
				emp.setHra((int) (0.3 * emp.getBasic()));
				emp.setDa((int) (0.2 * emp.getBasic()));
				emp.setDeductions((int) (0.1 * emp.getBasic()));
			} else if (emp.getBasic() >= 10000) {
				emp.setHra((int) (0.4 * emp.getBasic()));
				emp.setDa((int) (0.3 * emp.getBasic()));
				emp.setDeductions((int) (0.1 * emp.getBasic()));
			} else
			emp.setHra((int) (0.3 * emp.getBasic() + 500));
			emp.setDa((int) (0.2 * emp.getBasic() + 500));
			emp.setDeductions((int) (0.1 * emp.getBasic()));		
		}
		
		public List<Employee> getEmployees(){  
		    List<Employee> list=new ArrayList<Employee>();  
		    list = template.loadAll(Employee.class);  
		    return list;
}
}