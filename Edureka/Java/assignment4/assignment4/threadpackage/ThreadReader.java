package assignment4.threadpackage;

public class ThreadReader implements Runnable {

	public ThreadReader() {
		// TODO Auto-generated constructor stub
	}

	void evenNumbers(int count) {
		int num = 0;
		for(int i = 2;num<count;i+=2) {
			System.out.println(i);
			num++;
		}
	}
	
	 synchronized void table(int num, int count) {
		 int c = 0; 
		 for(int i=1;c<count;i++) {
		 System.out.println(num+" x "+i+" = "+i*num);
		 c++;
		 }
		 }
	
	@Override
	 public void run() {
		 table(5,10);
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadReader tRead = new ThreadReader();
		//tRead.table(5, 10);
	
		
		Thread t = new Thread(tRead);
		t.start();
		tRead.evenNumbers(20);
		
	
	}

}
