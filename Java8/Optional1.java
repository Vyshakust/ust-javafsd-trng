import java.util.Optional;
public class Optional1 {
	public static void main(String args[]) {
		Optional<String> strOptional =Optional.of("ONETWO");
		Optional<String> srOptional1 = strOptional.map(String::toLowerCase);
		srOptional1.ifPresent(System.out::println);
	
	}

}
