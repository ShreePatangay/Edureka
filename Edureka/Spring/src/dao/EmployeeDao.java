package dao;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import entity.Employee;

public class EmployeeDao implements DAO {
	@Autowired
	private JdbcTemplate jt;
	
	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public void saveEmp(Employee employee) {		
		String sql = "insert into employee(id,name,basic) values ("+employee.getId()+",'"+employee.getName()+"',"+employee.getBasic()+")";
		int rows_inserted = jt.update(sql);
		System.out.println("Employee Saved : "+ rows_inserted);		
	}

	@Override
	public void updateEmp(Employee employee) {
		String sql = "update employee set name='"+employee.getName()+"', basic="+employee.getBasic()+" where Id="+employee.getId();
		int rows_updated = jt.update(sql);
		System.out.println("Employees Updated : "+ rows_updated);
	}

	@Override
	public void deleteEmp(int id) {
		String sql = "delete from emp where id="+id;
		int rows_deleted = jt.update(sql);
		if(rows_deleted > 0)
			System.out.println("Employees Deleted : "+ rows_deleted);
		else
			System.out.println("Error: No matching employee found!");
	}

	@Override
	public List<Employee> getEmployees() {
		List<Employee> emps = new ArrayList<>();
		String sql = "select * from emp";
		
		emps = jt.query(sql, new ResultSetExtractor<List<Employee>>() {
			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Employee> list=new ArrayList<Employee>(); 
				while(rs.next()) {
					int eno = rs.getInt(1);
					String name = rs.getString(2);
					int sal = rs.getInt(3);
					Employee emp = new Employee(eno,name,sal);
					list.add(emp);
				}//while
				return list;
			}

		});
		return emps;
	}

	@Override
	public Employee getEmployee(String name) {
	String sql = "select * from emp where ename="+name;	
	return jt.queryForObject(sql, Employee.class);
	
}
}