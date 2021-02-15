package forlooppackage;

public class PrintNumbers {

	void printEven(){
		for(int i = 2;i<=10;i+=2) {
			System.out.println(i);
		}
	}
	
	void printOdd() {
		for(int k=1;k<=10;k+=2) {
			System.out.println(k);
		}
	}
	public static void main(String[] args) {
	PrintNumbers numbers= new PrintNumbers();
	numbers.printEven();
	numbers.printOdd();
	}

}
