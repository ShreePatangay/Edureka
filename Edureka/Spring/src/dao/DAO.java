package dao;

import java.util.List;

import entity.Employee;

public interface DAO {
	 public void saveEmp(Employee employee);
	 public void updateEmp(Employee employee);
	 public void deleteEmp(int id);
	 public List<Employee> getEmployees();
	 public Employee getEmployee(String name);
}
