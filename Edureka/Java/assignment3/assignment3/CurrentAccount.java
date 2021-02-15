package assignment3;

public final class CurrentAccount extends Account {
	public static final double MIN_BALANCE = 5000;
	

	public CurrentAccount(int accountNumber, String accountName, double amount) {
		super(accountNumber, accountName, amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	void deposit(double money) {
		// TODO Auto-generated method stub
		this.setAmount(this.getAmount() + money);
		System.out.println("Deposited "+this.getAmount() +" to the account "+this.getAccountName());
	}

	@Override
	double withdraw(double money) {
		// TODO Auto-generated method stub
		double amount = this.getAmount();
		if((amount - money)<=MIN_BALANCE) {
			System.out.println("amount has reached Minimum Balance so cant withdraw");
		}else {
			this.setAmount(this.getAmount() -  money);
			System.out.println("Credited "+this.getAmount()+" to the account "+this.getAccountName());
			}

		return money;
	}


}
