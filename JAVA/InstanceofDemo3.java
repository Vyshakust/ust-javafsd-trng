package day2set2;
class A{}
class B extends A{}

public class InstanceofDemo3 {
	public static void main(String args[]) {
		B objofClassB = new B();
		System.out.println("objOfClassB is an instance of B: " + (objofClassB instanceof B));
		System.out.println("objOfClassB is an instance of the parent class A:"+(objofClassB instanceof A));
	}

}
