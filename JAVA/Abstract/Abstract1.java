package Abstract;

abstract class Abstract1 {
	
	
	public void display() {
		System.out.println("This is Java Programming");
		
	}

}

class Main extends Abstract1{
	public static void main(String args[]) {
		Main obj = new Main();
		
		obj.display();
	}
	
		
	
}
