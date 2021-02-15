package dowhilepackage;

import java.util.Scanner;

public class Palindrome {
	static int reverse;
	 static int numberReverse(int number) {
	
			do {  
				
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
			number=number/10;
			}while(number != 0);   
				  
			return reverse;
	}
	
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter a number to reverse");
		int num = scn.nextInt();
		scn.close();
		int reverse = numberReverse(num);
		System.out.println("The reverse of the number "+num+" is: " + reverse);  

	}

}
