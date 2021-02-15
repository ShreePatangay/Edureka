package package1;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static final String jdbcDriver = "com.mysql.jdbc.Driver";
	public static final String jdbcUrl = "jdbc:mysql://localhost:3306/mysql";
	public static final String jdbcUserName = "root";
	public static final String jdbcPassword = "password";
	
	public static Connection getConnection() {
		try {
			//DriverManager.registerDriver(driver);
			return DriverManager.getConnection(jdbcUrl, jdbcUserName, jdbcPassword);
		} catch (SQLException e) {
			throw new RuntimeException("Error connecting to Database"+e);
			} 
	}
	public ConnectionFactory() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connect = ConnectionFactory.getConnection();
	}

}
