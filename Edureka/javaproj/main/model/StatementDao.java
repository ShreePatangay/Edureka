package model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import entity.Statement;

public class StatementDao {

	public StatementDao() {
	
	}

	private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Transactional(readOnly = false)
	public void saveStatement(Statement c){  
		System.out.println("Saved Statement: "+c);
	    template.save(c);  
	}  
	@Transactional(readOnly = false)
	public void updateStatement(Statement c){  
	    System.out.println("Updated Statement: "+c);
		template.update(c);  
	}  
	@Transactional(readOnly = false)
	public void deleteStatement(Statement c){  
		System.out.println("Deleted Statement: "+c);
	    template.delete(c);  
	}  
	  	
	public List<Statement> getStatement(){  
	    List<Statement> list=new ArrayList<Statement>();  
	    list = template.loadAll(Statement.class);  
	    return list;
}

}
