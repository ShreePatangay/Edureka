package assignment3;

public final class SavingsBankAccount extends Account {

	public SavingsBankAccount(int accountNumber, String accountName, double amount) {
		super(accountNumber, accountName, amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	void deposit(double money) {
		double amount = this.getAmount();
		this.setAmount(amount + money);
		System.out.println("Deposited "+this.getAmount() +" to the account "+this.getAccountName());
	}

	@Override
	double withdraw(double money) {
		// TODO Auto-generated method stub
		double amount = this.getAmount();
		if((amount - money)<=MIN_BALANCE) {
			System.out.println("amount has reached Minimum Balance so cant withdraw");
		}else {
			this.setAmount(amount-money);
			System.out.println("Credited "+this.getAmount()+" to the account "+this.getAccountName());
			}
		return money;
	}

}