package ifpackage;

public class FindLargest {

	void isLargest(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 + " is greater than " + num2);
		} else if (num2 > num1) {
			System.out.println(num2 + " is greater than " + num1);
		} else {
			System.out.println(num1 + " is equals to " + num2);
		}

	}

	public static void main(String[] args) {
		FindLargest number = new FindLargest();
		number.isLargest(23, 34);
		number.isLargest(54, 20);
		number.isLargest(64, 64);
	}

}
