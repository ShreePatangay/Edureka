package service;

public class CreditCard {

	public CreditCard() {
	
	}

	public float approveAmount(String cc,float balance,float amt) {
		return balance-amt; 
	}
}
