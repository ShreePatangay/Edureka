package entity;

public class Employee {
	private int id;
	private String name;
	private int basic;
	private int hra;
	private int da;
	private int deductions;

	public Employee() {
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBasic() {
		return basic;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	public int getHra() {
		return hra;
	}

	public void setHra(int hra) {
		this.hra = hra;
	}

	public int getDa() {
		return da;
	}

	public void setDa(int da) {
		this.da = da;
	}

	public int getDeductions() {
		return deductions;
	}

	public void setDeductions(int deductions) {
		this.deductions = deductions;
	}

	public Employee(String name, int basic, int hra, int da, int deductions) {
		super();
		this.name = name;
		this.basic = basic;
		this.hra = hra;
		this.da = da;
		this.deductions = deductions;
	}

	public Employee(int id, String name, int basic, int hra, int da, int deductions) {
		super();
		this.id = id;
		this.name = name;
		this.basic = basic;
		this.hra = hra;
		this.da = da;
		this.deductions = deductions;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", basic=" + basic + ", hra=" + hra + ", da=" + da
				+ ", deductions=" + deductions + "]";
	}

}
