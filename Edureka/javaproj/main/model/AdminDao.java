package model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import entity.Admin;

public class AdminDao {

	public AdminDao() {
		// TODO Auto-generated constructor stub
	}

	private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Transactional(readOnly = false)
	public void saveAdmin(Admin a){  
		System.out.println("Saved Customer: "+a);
	    template.save(a);  
	}  
	@Transactional(readOnly = false)
	public void updateAdmin(Admin a){  
	    System.out.println("Updated Customer: "+a);
		template.update(a);  
	}  
	@Transactional(readOnly = false)
	public void deleteAdmin(Admin a){  
		System.out.println("Deleted Admin: "+a);
	    template.delete(a);  
	}  
	  
	public Admin getAdmin(int acno) {
		Admin a = (Admin)template.get(Admin.class, acno);
		return a;
	}
	
	public boolean checkLogin(String username,String password) {
		boolean isValid = false;
		for(Admin admin: getAdmins()) {
		if(admin.getName()==username && admin.getPwd()==password)
		isValid=true;
		else
		isValid=false;
		}
		return isValid;
	}
		
	
	public List<Admin> getAdmins(){  
	    List<Admin> list=new ArrayList<Admin>();  
	    list = template.loadAll(Admin.class);  
	    return list;
}


}
