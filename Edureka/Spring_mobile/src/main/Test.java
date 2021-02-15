package main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.MobilePhoneDao;
import entity.MobilePhone;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		MobilePhoneDao dao = (MobilePhoneDao) context.getBean("mobiledao");
		MobilePhone m1 = new MobilePhone("Samsung M1",23000,"cyan");
		MobilePhone m2 = new MobilePhone("Xiaomi Redmi 9",12000,"black");
		MobilePhone m3 = new MobilePhone("Realme C3",11500,"rose");
		MobilePhone m4 = new MobilePhone("Vivo 15",18000,"turquoise");
		MobilePhone m5 = new MobilePhone("Apple i10",85000,"white");
		MobilePhone m6 = new MobilePhone("Hauwei 1",19000,"cyan");
		dao.saveMobile(m1);
		dao.saveMobile(m2);
		dao.saveMobile(m3);
		dao.saveMobile(m4);
		dao.saveMobile(m5);
		dao.saveMobile(m6);
		
		MobilePhone m = new MobilePhone();
		List<MobilePhone> mobile = dao.getMobiles();
		for (int i = 0; i < mobile.size(); i++) {
			m = mobile.get(i);
			System.out.println(m);
		}

		
		dao.deleteMobile(m1);
		dao.deleteMobile(m2);
		dao.deleteMobile(m3);
		dao.deleteMobile(m4);
		dao.deleteMobile(m5);
		dao.deleteMobile(m6);
	}

}
