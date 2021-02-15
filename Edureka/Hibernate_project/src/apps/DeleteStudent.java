package apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import configs.HibernateUtils;
import entity.Student;

public class DeleteStudent {

	public DeleteStudent() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();		
				
		Student st = session.get(Student.class, 111);
		
		if(st != null) {
			System.out.println(st);
			session.delete(st);
		}
		else
			System.out.println("No matching student found!");
		
		session.getTransaction().commit();
		
		session.close();
		sf.close();	
	}

}
