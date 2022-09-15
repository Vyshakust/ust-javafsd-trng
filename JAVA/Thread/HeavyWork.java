package Threads_ex;

public class HeavyWork implements Runnable {
	public void run() {
		System.out.println("Doing heavy processing -START"+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			doDBProcessing();
			
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		System.out.println("Doing hevay processing-End"+Thread.currentThread().getName());
	}
	private void doDBProcessing() throws InterruptedException{
		Thread.sleep(5000);
	}
	
	public static void main(String args[]) {
		HeavyWork ob = new HeavyWork();
		HeavyWork ob1 = new HeavyWork();
		ob.run();
		
	}
	




	}

