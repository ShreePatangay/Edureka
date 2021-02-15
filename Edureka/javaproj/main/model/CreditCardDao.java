package model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import entity.CreditCard;

public class CreditCardDao {

	public CreditCardDao() {
	
	}

	private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Transactional(readOnly = false)
	public void saveCreditCard(CreditCard c){  
		System.out.println("Saved CreditCard: "+c);
	    template.save(c);  
	}  
	@Transactional(readOnly = false)
	public void updateCreditCard(CreditCard c){  
	    System.out.println("Updated CreditCard: "+c);
		template.update(c);  
	}  
	@Transactional(readOnly = false)
	public void deleteCreditCard(CreditCard c){  
		System.out.println("Deleted CreditCard: "+c);
	    template.delete(c);  
	}  	  
	
	public List<CreditCard> getCreditCards(){  
	    List<CreditCard> list=new ArrayList<CreditCard>();  
	    list = template.loadAll(CreditCard.class);  
	    return list;
}

}
