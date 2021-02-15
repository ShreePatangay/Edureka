package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {
	@Id
	@Column(name = "Id", nullable = false, unique = true, length = 5)
	private Integer id;

	@Column(name = "NAME", length = 20)
	private String name;

	@Column(name = "MARKS", length = 10, precision = 2)
	private Float marks;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getMarks() {
		return marks;
	}

	public void setMarks(Float marks) {
		this.marks = marks;
	}

	public Student(String name, Float marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public Student(Integer id, String name, Float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [stId=" + id + ", sName=" + name + ", sMarks=" + marks + "]";
	}
}
