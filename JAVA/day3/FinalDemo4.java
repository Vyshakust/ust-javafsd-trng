package day3;

public class FinalDemo4 {
	public final void display() {
		System.out.println("This is the final method");
		
	}

}

class Main13 extends FinalDemo4{
	public final void display() {
		System.out.println("The final method is overridden");
	}
	
	public static void main(String args[]) {
		Main13 obj = new Main13();
		obj.display();
		
	}
}
