package day3;

public class This_constructor {
	int val1;
	int val2;
	
	
	This_constructor(){
		this(11,21);
		System.out.println("Default constructor\n");
	}
	
	This_constructor(int val1,int val2){
		this.val1 =val1;
		this.val2=val2;
		System.out.println("Paramterized construcotr");
	}
}

class Main4{
	public static void main(String args[]) {
		This_constructor object = new This_constructor();
	
	}

}
