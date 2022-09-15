package File;
import java.io.FileReader;

 class Filereader {
	 public static void main(String args[]) {
		 char[ ]array = new char[100];
		 try {
			 FileReader input = new FileReader("input.txt");
		 
		 input.read(array);
		 System.out.println("Datat in the file");
		 System.out.println(array);
		 input.close();
	 }
	 catch(Exception e) {
		 e.getStackTrace();
	 }

}
 }
