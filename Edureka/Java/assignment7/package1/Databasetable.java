package package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Databasetable {
	public static final String jdbcDriver = "com.mysql.jdbc.Driver";
	public static final String jdbcUrl = "jdbc:mysql://localhost:3306/mysql";
	public static final String jdbcUserName = "root";
	public static final String jdbcPassword = "password";
	
	
	public Databasetable() {
		
	}



	public static void main(String[] args)throws SQLException, ClassNotFoundException {
		Class.forName(jdbcDriver);
		Connection con = DriverManager.getConnection(jdbcUrl, jdbcUserName, jdbcPassword);
		
		Statement st = con.createStatement();
		try {
			
			System.out.println("Creating a database");
			st.execute("create database if not exists assignment");
			System.out.println("Connecting to new database");
			String usedb = "Use assignment;";
			st.execute(usedb);
			Thread.sleep(1000);
			
			System.out.println("Creating a table");
			String table = "create table if not exists student(studentid int, name varchar(10), class varchar(10), marks float(100,2), primary key(studentid));";
			st.execute(table);
			Thread.sleep(1000);
			
			System.out.println("Truncating table records");
			st.executeUpdate("truncate table student;");
			Thread.sleep(1000);
			
			System.out.println("Adding records to tables");
			String insertvalues = "insert into student values (101,'Jessy','class5',102.3),(102,'James','class5',68.74),(103,'Meowth','class5',99.99);";
			st.executeUpdate(insertvalues);
			Thread.sleep(1000);
			
			System.out.println("Updating record");
			String updatevalue = "update student set name='Nikky' where name='meowth';";
			st.executeUpdate(updatevalue);
			Thread.sleep(1000);
			
			System.out.println("Deleting a record");
			String deleterecord = "delete from student where studentid=103; ";
			st.executeUpdate(deleterecord);
			Thread.sleep(1000);
			
			System.out.println("Selecting records");
			String query = "select * from student;";
			ResultSet rst = st.executeQuery(query);
			while (rst.next()) {
				try {
					System.out.println(
							rst.getInt(1) + " " + rst.getString(2) + " " + rst.getNString(3) + " " + rst.getFloat(4));
				} catch (Exception e) {
					System.out.println("Exception: " + e);
				}
			}
			
			
		} catch (InterruptedException e) {
			System.out.println("Exception: " + e.getMessage());
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
