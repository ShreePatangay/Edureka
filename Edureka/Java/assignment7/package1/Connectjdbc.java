package package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectjdbc {

	public static final String jdbcDriver = "com.mysql.jdbc.Driver";
	public static final String jdbcUrl = "jdbc:mysql://localhost:3306/mysql";
	public static final String jdbcUserName = "root";
	public static final String jdbcPassword = "password";
	
	public void getjdbcConnection() throws SQLException, ClassNotFoundException {
		 Class.forName(jdbcDriver);
		 Connection con = DriverManager.getConnection(jdbcUrl, jdbcUserName, jdbcPassword);
	 }
	public Connectjdbc() {
		
	}

}
