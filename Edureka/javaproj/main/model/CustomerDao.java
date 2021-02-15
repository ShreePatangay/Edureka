package model;

import java.util.ArrayList;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import entity.Customer;

public class CustomerDao {

	public CustomerDao() {
	
	}
	private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Transactional(readOnly = false)
	public void saveCustomer(Customer c){  
		System.out.println("Saved Customer: "+c);
	    template.save(c);  
	}  
	@Transactional(readOnly = false)
	public void updateCustomer(Customer c){  
	    System.out.println("Updated Customer: "+c);
		template.update(c);  
	}  
	@Transactional(readOnly = false)
	public void deleteCustomer(Customer c){  
		System.out.println("Deleted Customer: "+c);
	    template.delete(c);  
	}  
	  
	public Customer getCustomer(int accno) {
		Customer c = (Customer)template.get(Customer.class, accno);
		return c;
	}
	
	public List<Customer> getCustomers(){  
	    List<Customer> list=new ArrayList<Customer>();  
	    list = template.loadAll(Customer.class);  
	    return list;
}

}
