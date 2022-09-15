package Generic;

public class Generic4 {
	public static void main(String args[]) {
		DemoClass demo = new DemoClass();
		demo.<String>genericMethod("Java programming");
		demo.<Integer>genericMethod(25);
		
	}

}

class DemoClass{
	public <T>void genericMethod(T data){
		System.out.println("Generic Method:");
		System.out.println("Data Passed:"+data);
	}
}

