package assignment3;

public abstract class Account {

	public static final double MIN_BALANCE = 5000;
	
	private int accountNumber;

	private String AccountName;

	private double amount;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return AccountName;
	}

	public void setAccountName(String accountName) {
		AccountName = accountName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Account(int accountNumber, String accountName, double amount) {
		super();
		
		this.accountNumber = accountNumber;
		AccountName = accountName;
		if(amount<MIN_BALANCE) {
			System.out.println("Amount stored is less than Minimum Balance");
			System.exit(0);	
			}else {
				this.amount = amount;	
				}
	}

	abstract void deposit(double money);
	abstract double withdraw(double money);
	void getDetails() {
		System.out.println("Account Number: "+this.getAccountNumber());
		System.out.println("Account Name: "+this.getAccountName());
		System.out.println("Balance available "+this.getAmount());
	}
	
}
