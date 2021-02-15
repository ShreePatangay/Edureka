package whilepackage;

import java.util.Scanner;

public class SumOfDigitsOfNumber {
static int sum = 0;
	static int digitsSum(int number) {
		while(number>0) {
			int reminder;
			reminder = number%10;
			sum = sum +reminder;
			number = number/10;
		}
		return sum;
	}
	public static void main(String[] args) {
	     int num;
	      int sumOfDigits = 0;
	      Scanner scn =  new Scanner(System.in);
	      System.out.print("Enter an integer number::");
	      num = scn.nextInt();
	      sumOfDigits = digitsSum(num);
	      System.out.println("The sum of digits of" +
	         " the number "+num+" = "+sumOfDigits);

	      scn.close();

	}

}
