package package1;

import java.util.List;

public interface StudentDao {
	public List getAllStudents();
	public Student getStudent(int studentid);
	public void updateStudent(Student student);
	public void deleteStudent(Student student);
}
