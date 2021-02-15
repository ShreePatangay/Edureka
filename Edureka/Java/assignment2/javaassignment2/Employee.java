package javaassignment2;

public class Employee {
	
	void display(int[] id, String[] name, double[] salary) {
		// this.employeeID=id;
		// this.employeeName=name;
		// this.employeeSalary=salary;
		for (int i = 0; i < 5; i++) {
			System.out.println(id[i] + " | " + name[i] + " | " + salary[i]);
		}
	}
	
	//method overloading
	void display(int[] empID,String[] empName) {
		for(int i=0;i<5;i++) {
			System.out.println(empID[i]+" | "+empName[i]);
		}
	}
	
	void display(String name, int[] empID,String[] empName,double[] empSalary) {
		for(int i=0;i<5;i++) {
			if(empName[i].contains(name)) {
		
				System.out.println(empID[i] + " | " + empName[i] + " | " + empSalary[i]);
			}
			}

	}
	public static void main(String[] args) {
		 int[] employeeID = { 00, 002, 003, 004, 005 };
		 String[] employeeName = { "John ", "Clark", "Nancy", "Joe  ", "Mary " };
		 double[] employeeSalary = { 600000, 550000, 500000, 500000, 300000 };

		Employee emp = new Employee();
		emp.display(employeeID, employeeName, employeeSalary);//question1
		emp.display(employeeID, employeeName);//question2
		emp.display("Joe", employeeID, employeeName, employeeSalary);//question3
	}

}
