package forlooppackage;

import java.util.Scanner;

public class Palindrome {
	static int reverse;
	 static int numberReverse(int number) {
	
			for(reverse=0 ;number != 0; number=number/10)   
			{  
			int remainder = number % 10;  
			reverse = reverse * 10 + remainder;  
			}  
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
