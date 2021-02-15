package package1;

public class Student {
	private int studentid;
	private String name;
	private String classname;
	private double marks;
	
	public Student(String name, String classname, double marks) {
		super();
		name = name;
		classname = classname;
		marks = marks;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		studentid = studentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		classname = classname;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		marks = marks;
	}
	public Student(int studentid, String name, String classname, double marks) {
		super();
		studentid = studentid;
		name = name;
		classname = classname;
		marks = marks;
	}
	public Student() {
	
	}

}
