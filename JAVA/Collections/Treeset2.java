package Day5;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset2 {
	public static void main(String args[]) {
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(6);
		System.out.println("TreeSet"+numbers);
		
		Iterator<Integer>iterate =numbers.iterator();
		System.out.println("TreeSet using iterator");
		
		while(iterate.hasNext()) {
			System.out.println("TreeSet using Itertor:");
			
			while(iterate.hasNext()) {
				System.out.println(iterate.next());
				System.out.println(",");
			}
		}
		
		
	}

}
