package Methodrefference;

public class Methodreff2 {
	public static void ThreadStatus() {
		System.out.println("Thread is running");
	}
	public static void main(String args[]) {
		Thread t2 = new Thread(Methodreff2::ThreadStatus);
		t2.start();
	}

}
