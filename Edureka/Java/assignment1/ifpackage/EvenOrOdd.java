package ifpackage;

public class EvenOrOdd {
	int number;
	
	void isEven() {
		if(number%2==0) {
		System.out.println(number+" is Even");
		}else if(number%2!=0) {
			System.out.println(number+" is Odd");
		}else {
			System.out.println(number+" is 0");
		}
	}
	public static void main(String[] args) {
		EvenOrOdd num = new EvenOrOdd();
		num.number=-16;
		num.isEven();
		num.number=16;
		num.isEven();
		num.number=0;
		num.isEven();
		num.number=77;
		num.isEven();
	}

}
