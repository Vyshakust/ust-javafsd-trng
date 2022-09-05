package day3;

public class Animal3 {
	protected String type ="animal";

}

class Dog4 extends Animal3{
	public String type ="mammal";
	
	public void printType() {
		System.out.println("I am a "+type);
		System.out.println("I am a "+super.type);
		
	}
}

class Main8{
	public static void main(String args[]) {
		Dog4 dog1= new Dog4();
		dog1.printType();
	}
}
