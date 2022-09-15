package Exception;

public class Exception1 {
	public static void main(String args[]) {
		try {
			int divideByZero = 5/0;
			System.out.println("Rest of the code in try block");
		}
		catch(ArithmeticException e) {
			System.out.println("ArithematicExpression =>"+e.getMessage());
			
		}
		finally {
			System.out.println("This is the finally block");
		}
	}

}
