package File;

import java.io.File;
import java.util.Iterator;

public class Fileobject {
	public static void main(String args[]) {
		File file = new File("C:\\Users\\ustjavafsdb222");
		String [] fileList = file.list();
		for(String str : fileList) {
			System.out.println(str);
		}
	}

}
