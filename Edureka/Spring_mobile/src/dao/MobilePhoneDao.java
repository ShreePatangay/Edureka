package dao;


import java.util.ArrayList;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import entity.MobilePhone;

public class MobilePhoneDao {
	private HibernateTemplate template;

	public MobilePhoneDao() {

	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Transactional(readOnly = false)
	public void saveMobile(MobilePhone m){  
		System.out.println("Saved Mobile Phone: "+m);
	    template.save(m);  
	}  
	@Transactional(readOnly = false)
	public void updateMobile(MobilePhone m){  
	    System.out.println("Updated Mobile Phone: "+m);
		template.update(m);  
	}  
	@Transactional(readOnly = false)
	public void deleteMobile(MobilePhone m){  
		System.out.println("Deleted Mobile Phone: "+m);
	    template.delete(m);  
	}  
	
	public List<MobilePhone> getMobiles(){  
	    List<MobilePhone> list=new ArrayList<MobilePhone>();  
	    list = template.loadAll(MobilePhone.class);  
	    return list;
}

}
