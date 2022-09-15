package Exception;

public class Throws {
	
	public double calculate(int a,int b)throws Exception {
		return a+b;
		
	}
	
	public static void main(String args[]) {
		Throws e = new Throws();
		try {
		e.calculate(5,6);
		}
		catch( Exception f) {
			f.printStackTrace();
		}
	}

}
