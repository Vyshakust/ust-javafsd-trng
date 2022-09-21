package functionalinterface2;
interface sayable{
	void say(String msg);
	int hashCode();
	String toString();
	boolean equals(Object obj);
}

public class Functionalinteg2 implements sayable{
	public void say(String msg) {
		System.out.println(msg);
	}
	public static void main(String args[]) {
		Functionalinteg2 file =  new Functionalinteg2();
		file.say("hello there");
		
	}
}
