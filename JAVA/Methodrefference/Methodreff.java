package Methodrefference;

interface Sayable{
	void say();
}
public class Methodreff {
	public static void saySomething() {
		System.out.println("Hello,this is satic method");
	}
	public static void main(String args[]) {
		Sayable sayable =Methodreff::saySomething;
		sayable.say();
		
	}

}
