package apps;



import java.util.LinkedList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import configs.HibernateUtils;
import entity.Student;

public class DisplayStudents {

	public DisplayStudents() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		List<Student> list = new LinkedList<>();
		
		Student st1 = session.get(Student.class, 101);	
		list.add(st1);
		Student st2 = session.get(Student.class, 102);	
		list.add(st2);
		Student st3 = session.get(Student.class, 103);	
		list.add(st3);
		Student st4 = session.get(Student.class, 104);	
		list.add(st4);
		Student st5 = session.get(Student.class, 105);	
		list.add(st5);
		Student st6 = session.get(Student.class, 106);	
		list.add(st6);
		Student st7 = session.get(Student.class, 107);	
		list.add(st7);
		Student st8 = session.get(Student.class, 108);	
		list.add(st8);
		Student st9 = session.get(Student.class, 109);	
		list.add(st9);
		Student st10 = session.get(Student.class, 110);	
		list.add(st10);
		if(list != null)
			System.out.println(list);
		
		session.close();
		sf.close();	

	}

}
