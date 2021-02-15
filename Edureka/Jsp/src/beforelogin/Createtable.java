package beforelogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Createtable {
	public static final String jdbcDriver = "com.mysql.jdbc.Driver";
	public static final String jdbcUrl = "jdbc:mysql://localhost:3306/mysql";
	public static final String jdbcUserName = "root";
	public static final String jdbcPassword = "password";
	
	public Createtable() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(jdbcDriver);
		Connection con = DriverManager.getConnection(jdbcUrl, jdbcUserName, jdbcPassword);
		
		Statement st = con.createStatement();
		try {
			
			System.out.println("Creating a database");
			st.execute("create database if not exists servlet");
			System.out.println("Connecting to new database");
			String usedb = "Use servlet;";
			st.execute(usedb);
			
			System.out.println("Creating a table");
			String table = "create table if not exists user_pass(name varchar(100), password varchar(50), primary key(name));";
			st.execute(table);
			
			System.out.println("Truncating table records");
			st.executeUpdate("truncate table user_pass;");
			
			System.out.println("Adding records to tables");
			String insertvalues = "insert into user_pass values ('admin','123'),('scott','tiger'),('ramesh','suresh'),('Sunil','Joseph'),('Jessy','girlpower'),('James','boypower'),('Meowth','pokemon');";
			st.executeUpdate(insertvalues);
			
			
			//System.out.println("Deleting a record");
			//String deleterecord = "delete from user_pass where password=103; ";
			//st.executeUpdate(deleterecord);
			//Thread.sleep(1000);
			
			System.out.println("Selecting records\n");
			String query = "select * from user_pass;";
			ResultSet rst = st.executeQuery(query);
			while (rst.next()) {
				try {
					System.out.println(
							rst.getString(1) + " " + rst.getString(2) + " ") ;
				} catch (Exception e) {
					System.out.println("Exception: " + e);
				}
			}
			
			
		} finally {
			if (st != null) {
				st.close();
			}
			if (con != null) {
				con.close();
			}
		}

	}

}
