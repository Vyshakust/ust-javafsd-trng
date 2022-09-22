package stream123;
import java.util.function.Predicate;



public class PredictableExample {
	public static void main(String args[]) {
		Predicate<Integer>checkOddEven = x->x%2==0;
		
		System.out.println("Number 14 is EVEN:"+checkOddEven.test(14));
		System.out.println("Number 18 is ODD:"+checkOddEven.test(18));
		System.out.println("Number 21 is EVEN:"+checkOddEven.test(21));
		
	}

}
