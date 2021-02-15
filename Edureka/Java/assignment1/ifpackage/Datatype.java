package ifpackage;

public class Datatype {

	void calculate(int a, int b) {
		System.out.println("addition" + (a + b));
		System.out.println("subtraction" + (a - b));
		System.out.println("multiplication" + (a * b));
		System.out.println("division" + (a / b));
		System.out.println("increment" + (a++));
		System.out.println("decrement" + (a--));

	}

	void calculate(short a, short b) {
		System.out.println("addition" + (a + b));
		System.out.println("subtraction" + (a - b));
		System.out.println("multiplication" + (a * b));
		System.out.println("division" + (a / b));
		System.out.println("increment" + (a++));
		System.out.println("decrement" + (a--));
	}

	void calculate(byte a, byte b) {
		System.out.println("addition" + (a + b));
		System.out.println("subtraction" + (a - b));
		System.out.println("multiplication" + (a * b));
		System.out.println("division" + (a / b));
		System.out.println("increment" + (a++));
		System.out.println("decrement" + (a--));

	}

	void calculate(long a, long b) {
		System.out.println("addition" + (a + b));
		System.out.println("subtraction" + (a - b));
		System.out.println("multiplication" + (a * b));
		System.out.println("division" + (a / b));
		System.out.println("increment" + (a++));
		System.out.println("decrement" + (a--));

	}

	void calculate(float a, float b) {
		System.out.println("addition" + (a + b));
		System.out.println("subtraction" + (a - b));
		System.out.println("multiplication" + (a * b));
		System.out.println("division" + (a / b));
		System.out.println("increment" + (a++));
		System.out.println("decrement" + (a--));

	}

	void calculate(double a, double b) {
		System.out.println("addition" + (a + b));
		System.out.println("subtraction" + (a - b));
		System.out.println("multiplication" + (a * b));
		System.out.println("division" + (a / b));
		System.out.println("increment" + (a++));
		System.out.println("decrement" + (a--));

	}

	public static void main(String[] args) {
		Datatype d = new Datatype();
		byte bnum1 = 8;
		byte bnum2 = 6;
		int num1 = 232;
		int num2 = 100;
		short snum1 = 16;
		short snum2 = 10;
		long lnum1 = 65L;
		long lnum2 = 32L;
		double dfloat1 = 0.3344;
		double dfloat2 = 0.6432;
		float ft1 = 0.344F;
		float ft2 = 0.432F;

		boolean isitTrue = false;
		System.out.println(isitTrue);
		char c = 'C';
		System.out.println(c);
		String s = "String";
		System.out.println(s);
		d.calculate(bnum1, bnum2);
		d.calculate(num1, num2);
		d.calculate(snum1, snum2);
		d.calculate(lnum1, lnum2);
		d.calculate(ft1, ft2);
		d.calculate(dfloat1, dfloat2);

	}

}
