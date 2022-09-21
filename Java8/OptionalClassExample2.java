import java.util.Optional;
public class OptionalClassExample2 {
	public static void main(String args[]) {
		Optional<String>emptyOption = Optional.empty();
		Optional<String>strOption = Optional.of("one");
		System.out.println(emptyOption.orElseGet(()->"optional null or ElseGet"));
		System.out.println(emptyOption.orElseGet(()->"optional value, or ElseGet"));
	}

}
