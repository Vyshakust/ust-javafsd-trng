package File;
import java.io.FileReader;
import java.io.BufferedReader;

class Bufferedreader {
	
	public static void main(String args[]) {
		char array[]= new char[100];
		try {
			FileReader file = new FileReader("input.txt");
			BufferedReader input = new BufferedReader(file);
			input.read(array);
			System.out.println("Data int he file: ");
			System.out.println(array);
			input.close();
			
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
