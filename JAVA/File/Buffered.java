package File;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class Buffered {
	public static void man(String args[]) {
		String data = "This is the data in the output file";
		try {
			FileWriter file = new FileWriter("output.txt");
			BufferedWriter output = new BufferedWriter(file);
			output.write(data);
			output.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
