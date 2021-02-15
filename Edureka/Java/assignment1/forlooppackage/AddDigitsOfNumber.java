package forlooppackage;

import java.util.Scanner;

public class AddDigitsOfNumber {
	public static int digitSum(int number) {
	      int reminder = 0;
	      int sum;

	      for(sum=0;number>0;number=number/10) {

	         reminder = number % 10;

	         sum = sum + reminder;

	      }
	      return sum;
	  }

	  public static void main(String[] args) {
	      int num;
	      int sumOfDigits = 0;
	      Scanner scn =  new Scanner(System.in);
	      System.out.print("Enter an integer number::");
	      num = scn.nextInt();
	      sumOfDigits = digitSum(num);
	      System.out.println("The sum of digits of" +
	         " the number "+num+" = "+sumOfDigits);

	      scn.close();
	  }

}
