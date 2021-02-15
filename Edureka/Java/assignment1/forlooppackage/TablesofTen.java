package forlooppackage;

import java.util.Scanner;

public class TablesofTen {
	static int upTo;
	static void tableOfTen(int k) {
		for(int i=1;i<k;i++) {
			System.out.println("10 X "+i+" = "+i*10);
		}
	}
 	public static void main(String[] args) {
		System.out.println("Showing table of 10");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number upto which table:");
		upTo=scn.nextInt();
		scn.close();
		System.out.println("Showing 10 table upto "+upTo);
		tableOfTen(upTo);
	}

}
