package ifpackage;

public class NumberIsPositive {

	int num;

	void isPositive() {
		if (num > 0) {
			System.out.println("Number is Positive");
		} else if (num < 0) {
			System.out.println("Number is Negative");
		} else {
			System.out.println("Number is Zero");
		}
	}

	public static void main(String[] args) {
		NumberIsPositive number = new NumberIsPositive();
		number.num = -34;
		number.isPositive();
		number.num = 24;
		number.isPositive();
		number.num = 0;
		number.isPositive();
	}

}
