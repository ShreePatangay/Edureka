package ifpackage;

public class Voting {
	int age;

	boolean isEligible() {
		if (age >= 18) {
			System.out.println("Eligible for voting");
			return true;
		} else {
			System.out.println("under age for voting");
			return false;
		}
	}

	public static void main(String[] args) {
		Voting forRamu = new Voting();
		forRamu.age = 16;
		forRamu.isEligible();
		forRamu.age = 64;
		forRamu.isEligible();
	}

}
