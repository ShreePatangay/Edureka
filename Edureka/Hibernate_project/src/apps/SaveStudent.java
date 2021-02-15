package apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import configs.HibernateUtils;
import entity.Student;

public class SaveStudent {

	public SaveStudent() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Student st = new Student(101,"Sunil Joseph", 25.50f);
		Integer id = (Integer) session.save(st);
		System.out.println("Student with No: "+ id+" is Saved");
		
		tx.commit();
		session.close();
		sf.close();
	}

}
