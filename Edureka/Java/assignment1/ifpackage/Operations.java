package ifpackage;

public class Operations {

	public int addition(int a, int b) {
		int c = a + b;
		return c;
	}

	public int subtraction(int a, int b) {
		int c = a - b;
		return c;
	}

	public int multiplication(int a, int b) {
		int c = a * b;
		return c;
	}

	public int divition(int a, int b) {
		int c = a / b;
		return c;
	}
	

	public static void main(String[] args) {
		Operations d = new Operations();
		int add = d.addition(10, 20);
		System.out.println(add);
		int sub = d.subtraction(20, 10);
		System.out.println(sub);
		int mul = d.multiplication(10, 20);
		System.out.println(mul);
		int div = d.divition(10, 20);
		System.out.println(div);
		add = add++;
		System.out.println(add);
		sub = sub--;
		System.out.println(sub);

	}

}
