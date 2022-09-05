package day3;

public class Paraconst {
	int val1;
	int val2;
	
	Paraconst(int val1 ,int val2)
	{
		this.val1=val1+val1;
		this.val2=val2+val2;
		
	}
	
	void display() {
		System.out.println("Value val1 = "+val1+" Value val2 ="+val2);
	}
	
}
	
	
	
class Main{
	

	public static void main(String args[]) {
		Paraconst object = new Paraconst(5,10);
		object.display();
	}


	
}