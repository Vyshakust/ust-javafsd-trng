package Threads_ex;

public class Thread3 extends Thread {
	public static void main(String args[]) {
		Thread t3= new Thread();
		try {
			System.out.println("hi");
			t3.sleep(5000);
			System.out.println("Sleapt");
		}
		catch(Exception ex) {
			ex.getStackTrace();
		}
	}

}
