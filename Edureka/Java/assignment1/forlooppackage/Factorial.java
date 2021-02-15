package forlooppackage;

import java.util.Scanner;

public class Factorial {
	static int num;
	long g =1;
	void factorialNumber(int k) {
		for(int i=1;i<=k;i++) {
		g=g*i;
		}
		System.out.println("Factorial  of "+k+" is "+g);
	}
	public static void main(String[] args) {
	Factorial number = new Factorial();
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter a number to get factorial: ");
	num = scn.nextInt();
	scn.close();
	number.factorialNumber(num);
	
	}

}
