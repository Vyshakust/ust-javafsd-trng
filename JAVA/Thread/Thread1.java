package Threads_ex;

public class Thread1 extends Thread{
	
	public static void main(String args[]) {
		
		Thread1 t = new Thread1();
		t.start();

		
	}
	public void run() {
		System.out.println("This is a thread");
	}
}
