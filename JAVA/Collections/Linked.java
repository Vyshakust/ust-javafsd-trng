package Day5;

import java.util.LinkedHashMap;

public class Linked {
	public static void main(String args[]) {
		LinkedHashMap<String,Integer>evenNumbers=new LinkedHashMap<>();
		evenNumbers.put("Two", 2);
		evenNumbers.put("Four", 4);
		System.out.println("LinkedHashMap1:" +evenNumbers);
		
		LinkedHashMap<String,Integer>numbers=new LinkedHashMap<>(evenNumbers);
		numbers.put("Three", 3);
		System.out.println("LinkedHahMap2"+numbers);
	}

}
