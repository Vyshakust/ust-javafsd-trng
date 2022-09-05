package day3;

public class Animal2 {
	public void display() {
		System.out.println("I am an animal");
	}

}

class Dog2 extends Animal2{
	public void display() {
		System.out.println("I am a dog");
	}
	
	public void printmessage() {
		display();
		super.display();
	}
}


class Main7{
	public static void main(String args[]) {
		Dog2 d2= new Dog2();
		d2.printmessage();
	}
}
