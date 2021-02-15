package dowhilepackage;

import java.util.Scanner;

public class TablesOfTen {
	static int upTo;
	static void tableOfTen(int k) {
		int i =1;
		 do {
			System.out.println("10 X "+i+" = "+i*10);
			i++;
		}while(i<=k);
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
