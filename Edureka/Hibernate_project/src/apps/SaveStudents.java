package apps;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import configs.HibernateUtils;
import entity.Student;

public class SaveStudents {

	public SaveStudents() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		String req = "Y";
		while (req.equalsIgnoreCase("Y")) {
			System.out.println("enter student id: ");
			Integer sid = sc.nextInt();
			System.out.println("enter student name: ");
			String name = sc.next();
			System.out.println("enter student marks: ");
			Float marks = sc.nextFloat();

			Student st = new Student(sid,name, marks);

			session.save(st);

			System.out.print("Do you want to save more students[Y/N]: ");
			req = sc.next();
		} // while

		System.out.println("-----------------------------");
		tx.commit();

		
		session.close();
		sf.close();
		sc.close();
	}

}
