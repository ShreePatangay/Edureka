package configs;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	public HibernateUtils() {
		// TODO Auto-generated constructor stub
	}
	 private static SessionFactory sfactory = null;
	 public static SessionFactory getSessionFactory() {
		 if(sfactory == null) {
			 Configuration config = new Configuration();
	  		 config.configure("configs/hibernate.cfg.xml"); 
				
			 sfactory = config.buildSessionFactory();
		 }
		 return sfactory;
	 }
}
