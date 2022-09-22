package stream123;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Stream1 {

	public static void main(String args[]) {
		List<String> str = new ArrayList<>();
		str.add("Vyshak");
		str.add("Ashiq");
		str.add("Vishnu");
		Predicate sp = s->s.equals("Vyshak");
		Stream sr = str.stream().filter(sp);
		System.out.println(sr.collect(Collectors.toList()));
		
	}

}
