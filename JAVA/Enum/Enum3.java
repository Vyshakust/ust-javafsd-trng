package Enum;

enum Size2{
	SMALL,MEDIUM,LARGE,EXTRALARGE
}

public class Enum3 {
	Size2 pizzaSize;
	public Enum3(Size2 pizzaSize){
		this.pizzaSize=pizzaSize;
		
	}
	public void orderPizza() {
		switch(pizzaSize) {
		case SMALL:
			System.out.println("I ordered a small size pizza");
			break;
		case MEDIUM:
			System.out.println("I ordered a medium size pizza");
			break;
		default:
			System.out.println("I dont know which  pizza is this");
			break;
		
		}
		
	}

}

class Main {
	public static void main(String args[]) {
		Enum3 t1 = new Enum3(Size2.MEDIUM);
		t1.orderPizza();
		
	}
}
