package package2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BatchProccesing {
	public static final String jdbcDriver = "com.mysql.jdbc.Driver";
	public static final String jdbcUrl = "jdbc:mysql://localhost:3306/assignment";
	public static final String jdbcUserName = "root";
	public static final String jdbcPassword = "password";
	
	
	public BatchProccesing() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try{  
			  
			Class.forName(jdbcDriver);  
			Connection con=DriverManager.getConnection(jdbcUrl, jdbcUserName, jdbcPassword);  
			  con.setAutoCommit(false);
			PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?)");  
			  
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
			while(true){  
			  
			System.out.println("enter studentid");  
			String s1=br.readLine();  
			int id=Integer.parseInt(s1);  
			  
			System.out.println("enter name");  
			String name=br.readLine();  
			  
			System.out.println("enter class");  
			String cname=br.readLine();   
			
			System.out.println("enter marks");
			String s2=br.readLine();  
			double marks=Double.parseDouble(s1);  
			
			  
			ps.setInt(1,id);  
			ps.setString(2,name);  
			ps.setString(3, cname);
			
			ps.setDouble(4,marks);  
			
			ps.addBatch();  
			System.out.println("Want to add more records y/n");  
			String ans=br.readLine();  
			if(ans.equals("n")){  
			break;  
			}  
			  
			}  
			ps.executeBatch();  
			  
			System.out.println("record successfully saved");  
			con.commit();  
			  
			}catch(Exception e){
			
				System.out.println(e);
				
			}
			  

	}

}
