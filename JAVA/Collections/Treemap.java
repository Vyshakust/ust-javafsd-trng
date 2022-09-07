package Day5;

import java.util.Map;
import java.util.TreeMap;

public class Treemap {
	public static void main(String args[]) {
		Map<String,Integer>values = new TreeMap<>();
		
		values.put("Second", 2);
		values.put("First", 1);
		System.out.println("Map using TreeMap:"+values);
		
		values.replace("First",11);
		values.replace("Second", 22);
		System.out.println("New Map" +values);
		
		int removeValue =values.remove("First");
		System.out.println("Removed Value:" + removeValue);
	}

}
