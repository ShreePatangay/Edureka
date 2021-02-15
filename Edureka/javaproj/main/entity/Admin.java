package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_pass")
public class Admin {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "acno", nullable = false, unique = true, length = 5)
	private Integer acno;
	
	@Column(name = "name", unique = true, length = 20)	
	private String name;
	
	@Column(name = "password", length = 20)	
	private String pwd;

	@Column(name = "balance")	
	private float balance;

	public Integer getAcno() {
		return acno;
	}

	public void setAcno(Integer acno) {
		this.acno = acno;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Admin() {
		
	}

	public Admin(String name, String pwd, float balance) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Admin [acno=" + acno + ", name=" + name + ", balance=" + balance + "]";
	}

	public Admin(String name, String pwd) {
		super();
		this.name = name;
		this.pwd = pwd;
	}

}
