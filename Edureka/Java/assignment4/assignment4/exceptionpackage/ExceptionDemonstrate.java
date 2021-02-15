package assignment4.exceptionpackage;

public class ExceptionDemonstrate {

	public ExceptionDemonstrate() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	int[] array = {0,1,2,3,4,5,6,7};
	try {
	System.out.println(array[9]);
	}catch(ArrayIndexOutOfBoundsException e) {
		System.err.println("Exception Occured: "+e.getMessage());
	}
	
	}

}
