package entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account_details")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "accno", nullable = false, unique = true)
	private Integer accno;

	@Column(name = "name", length = 20)
	private String name;

	@Column(name = "dob", length = 20)
	private java.sql.Date dob;

	@Column(name = "address", length = 20)
	private String address;

	@Column(name = "email", length = 20)
	private String email;

	@Column(name = "acctype", length = 20)
	private String acctype;

	public Integer getUno() {
		return accno;
	}

	public void setUno(Integer uno) {
		this.accno = uno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public java.sql.Date getDob() {
		return dob;
	}

	public void setDob(java.sql.Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAcctype() {
		return acctype;
	}

	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}

	public Customer() {

	}

	public Customer(Integer uno, String name, Date dob, String address, String email, String acctype) {
		super();
		this.accno = uno;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.email = email;
		this.acctype = acctype;
	}

	public Customer(String name, Date dob, String address, String email, String acctype) {
		super();
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.email = email;
		this.acctype = acctype;
	}

	@Override
	public String toString() {
		return "Customer [uno=" + accno + ", name=" + name + ", dob=" + dob + ", address=" + address + ", email="
				+ email + ", acctype=" + acctype + "]";
	}

}