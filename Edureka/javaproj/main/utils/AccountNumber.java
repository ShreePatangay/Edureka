package utils;

public class AccountNumber {

	String name;

	public AccountNumber(String name, float balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	float balance;

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public AccountNumber() {

	}

	public void debit(AccountNumber DebitFrom, AccountNumber CreditTo, float amount) {
		CreditTo.setBalance(CreditTo.balance - amount);
		DebitFrom.setBalance(DebitFrom.balance + amount);
	}

	public void credit(AccountNumber CreditFrom, AccountNumber DebitTo, float amount) {
		DebitTo.setBalance(DebitTo.balance - amount);
		CreditFrom.setBalance(CreditFrom.balance + amount);
	}
}
