package dowhilepackage;

public class PrintNumbers {

	void printEven(){
		int i = 2;
		do {
		System.out.println(i);
			i+=2;
		}while(i<=10);
			
	}
	
	void printOdd() {
		int k=1;
		do {
			System.out.println(k);
			k+=2;
		}while(k<=10);
	}
	public static void main(String[] args) {
	PrintNumbers numbers= new PrintNumbers();
	numbers.printEven();
	numbers.printOdd();
	}

}




