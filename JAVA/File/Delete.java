package File;

import java.io.File;

 class Delete {
	 public static void main(String args[]) {
		 File file = new File("file.txt");
		 
		 boolean value = file.delete();
		 if(value) {
			 System.out.println("The file is deleted");
		 }
		 else {
			 System.out.println("The file is not deleted");
		 }
	 }

}
