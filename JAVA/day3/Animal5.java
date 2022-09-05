package day3;

public class Animal5 {
	Animal5(){
		System.out.println("I am an animal");
	}
	
	Animal5(String type){
		System.out.println("Type: "+type);
	}

}

class Dog9 extends Animal5{
	Dog9(){
		super("Animal5");
		System.out.println("I am a dog");
		
		
	}
}

class Main12{
	public static void main(String args[]) {
		Dog9 dog7 = new Dog9();
	}
	
}