package Switch;

public class Switchcase {
	public static void main(String args[]) {
		int number=44;
		String size;
		
		switch (number) {
		case 29:
			size ="small";
			break;
			
		case 42:
			size ="medium";
			break;	
			
		case 44:
			size ="large";
			break;
		case 48:
			size="Extra large";
			break;
			
		default:
			size="unknown";
			break;
		}
		System.out.println("Size:"+size);
	}
}
