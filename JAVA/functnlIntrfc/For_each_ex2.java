package Foreach;
import java.util.ArrayList;
import java.util.List;

public class For_each_ex2 {
	public static void main(String args[]) {
		List<String> gamesList = new ArrayList<String>();
		gamesList.add("Football");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hocky");
		System.out.println("_______________________Iterating by passing method reference_______________");
		gamesList.forEach(System.out::println);
		
	}

}

