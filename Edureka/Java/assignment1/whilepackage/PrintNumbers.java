package whilepackage;

public class PrintNumbers {

		void printEven(){
			int i = 2;
			while(i<=10) {
				System.out.println(i);
				i+=2;
			}
		}
		
		void printOdd() {
			int k=1;
			while(k<=10) {
				System.out.println(k);
				k+=2;
			}
		}
		public static void main(String[] args) {
		PrintNumbers numbers= new PrintNumbers();
		numbers.printEven();
		numbers.printOdd();
		}

	}


