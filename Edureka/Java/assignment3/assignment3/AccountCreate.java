package assignment3;

import java.util.Scanner;

public class AccountCreate {
	static Account acc;
	static int accNum;
	
	static String accName;
	static double accAmount;
	public AccountCreate() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter which Account type to be created "
				+ "\n1.Create Savings Bank Account"
				+ " \n2.Create Current Account");
		
		int readNumber = scn.nextInt();
		switch (readNumber) {
		case 1:
			System.out.println("Creating Savings Bank Account");
			System.out.println("Enter Account Number");
			accNum = scn.nextInt();
			System.out.println("Enter Account Holder Name");
			accName = scn.next();
			accName = accName.toUpperCase();
			System.out.println("Enter amount to be stored \\nNOTE: minimum balance is 5000");
			accAmount = scn.nextDouble();
			acc = new SavingsBankAccount(accNum,accName,accAmount);
			System.out.println("Created a Savings Bank Account");
			
		break;
		case 2:
			System.out.println("Creating Current Account");
			System.out.println("Enter Account Number");
			accNum = scn.nextInt();
			System.out.println("Enter Account Holder Name");
			accName = scn.next();
			accName = accName.toUpperCase();
			System.out.println("Enter amount to be stored \nNOTE: minimum balance is 5000");
			accAmount = scn.nextDouble();
			acc = new CurrentAccount(accNum,accName,accAmount);
			System.out.println("Created a Savings Bank Account");
			
		break;
		default:
			System.out.println("Invalid key provided");
			System.exit(0);
		break;	
		}
		
		acc.getDetails();
		System.out.println("Select process to be performed "
				+ "\n1.Deposit amount "
				+ "\n2.Withdraw amount");
		int key = scn.nextInt();
		if(key==1) {
			System.out.println("Enter amount to be deposited");
			double money = scn.nextDouble();
			acc.deposit(money);	
		}else if(key==2) {
			System.out.println("Enter amount to be deposited");
			double money = scn.nextDouble();
			acc.withdraw(money);
		}else {
			System.out.println("Invalid key pressed");
			System.exit(0);
		}
		scn.close();
		
	}

}
