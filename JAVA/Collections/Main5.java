package Day5;

import java.util.ArrayList;
import java.util.List;


public class Main5 {

	public static void main(String args[]) {
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println("List :"+numbers);
		
		int number = numbers.get(2);
		System.out.println("Accessed Element"+number);
		
		int removeNumber = numbers.remove(1);
		System.out.println("Removed Element:"+removeNumber);
		
		
		
	}

}
