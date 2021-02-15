package entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="statement")
public class Statement {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "sno", nullable = false, unique = true, length = 5)
	private Integer sno;
	
	@Column(name = "date", unique = true, length = 20)	
	private java.sql.Date dot;
	
	@Column(name = "description", length = 20)	
	private String desc;

	@Column(name = "chequeno")	
	private String cheque;

	@Column(name = "withdraw")	
	private float withdraw;

	@Column(name = "deposit")	
	private float deposit;
	
	@Column(name = "availableBalance")	
	private float balance;

	public Integer getSno() {
		return sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public java.sql.Date getDot() {
		return dot;
	}

	public void setDot(java.sql.Date dot) {
		this.dot = dot;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getCheque() {
		return cheque;
	}

	public void setCheque(String cheque) {
		this.cheque = cheque;
	}

	public float getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(float withdraw) {
		this.withdraw = withdraw;
	}

	public float getDeposit() {
		return deposit;
	}

	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public Statement() {
		
	}

	public Statement(Date dot, String desc, String cheque, float withdraw, float deposit, float balance) {
		super();
		this.dot = dot;
		this.desc = desc;
		this.cheque = cheque;
		this.withdraw = withdraw;
		this.deposit = deposit;
		this.balance = balance;
	}

	public Statement(Integer sno, Date dot, String desc, String cheque, float withdraw, float deposit, float balance) {
		super();
		this.sno = sno;
		this.dot = dot;
		this.desc = desc;
		this.cheque = cheque;
		this.withdraw = withdraw;
		this.deposit = deposit;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "[sno=" + sno + ", dot=" + dot + ", desc=" + desc + ", cheque=" + cheque + ", withdraw="
				+ withdraw + ", deposit=" + deposit + ", balance=" + balance + "]\n";
	}


	
}
