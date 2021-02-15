package entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="credit_card")
public class CreditCard {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "sno", nullable = false, unique = true, length = 5)
	private Integer sno;
	
	@Column(name = "name", length = 20)	
	private String name;
	
	@Column(name = "cardnumber", length = 20)	
	private String cno;

	@Column(name = "cvv", length = 20)	
	private Integer cvv;

	@Column(name = "expirydate", length = 20)	
	private java.sql.Date doe;

	@Column(name = "balance")	
	private float balance;

	public Integer getSno() {
		return sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	public Integer getCvv() {
		return cvv;
	}

	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}

	public java.sql.Date getDoe() {
		return doe;
	}

	public void setDoe(java.sql.Date doe) {
		this.doe = doe;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public CreditCard() {
	}

	public CreditCard(String name, String cno, Integer cvv, Date doe, float balance) {
		super();
		this.name = name;
		this.cno = cno;
		this.cvv = cvv;
		this.doe = doe;
		this.balance = balance;
	}

	public CreditCard(Integer sno, String name, String cno, Integer cvv, Date doe, float balance) {
		super();
		this.sno = sno;
		this.name = name;
		this.cno = cno;
		this.cvv = cvv;
		this.doe = doe;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "CreditCard [sno=" + sno + ", name=" + name + ", cno=" + cno + ", cvv=" + cvv + ", doe=" + doe
				+ ", balance=" + balance + "]";
	}

}
