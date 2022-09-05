package day3;

public class Animal4 {
	Animal4(){
		System.out.println("I am an animal");
	}

}

class Dog5 extends Animal4{
	Dog5(){
		super();
		System.out.println("I am a dog");
	}
}

class Main10{
	public static void main(String args[]) {
		Dog5 dog1 = new Dog5();
	}
}