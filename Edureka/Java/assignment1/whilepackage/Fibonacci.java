package whilepackage;

public class Fibonacci {

	public static void main(String[] args) {
		 int maxNumber = 10; 
		 int previousNumber = 0;
		 int nextNumber = 1;
		 int i=1;
		 
	        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
 
	        while (i <= maxNumber)
	        {
	        	System.out.print(previousNumber+" ");
	      	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	            ++i;

	}

}
}