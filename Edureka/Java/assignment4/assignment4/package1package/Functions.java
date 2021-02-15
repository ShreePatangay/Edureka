package assignment4.package1package;

public class Functions {

	public Functions() {
		// TODO Auto-generated constructor stub
	}

	public int subtract(int x, int y) {
		System.out.println(x-y);
		return (x - y);
	}

	public int multiply(int x, int y) {
		System.out.println(x-y);
		return (x - y);
	}

	public int divide(int x, int y)  {
		if(y!=0) {
			System.out.println(x/y);
			return (x / y);
		}
		else {
			System.out.println("Exception occured");
			return 0;
		}
		}

	public long factorial(long number) {
		if (number <= 1)
			return 1;
		else
			System.out.println(number * factorial(number - 1));
			return number * factorial(number - 1);

	}

	public int reversing(int number) {
		int reverse = 0;
		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println(reverse);
		return reverse;
	}

}
