package Methodrefference;

public class Instancemetref {
	public void printMsg() {
		System.out.println("hello this is the instance method");
	}
	public static void main(String args[]) {
		Thread t2 = new Thread(new Instancemetref()::printMsg);
		t2.start();
	}

}
