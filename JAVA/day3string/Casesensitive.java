package day3_string;

public class Casesensitive {
	public static void main(String args[]) {
		String str1 = "Learn Java";
		String str2 = "Java";
		String str3 = "java";
		Boolean result;
		
		if(str1.contains(str2)) {
			System.out.println(str1 + " contains"+str2);
		}
		else {
			System.out.println(str1 + " does not contain"+str2);
		}
		
		if(str1.contains(str3)) {
			System.out.println(str1 +"contains"+str3);
		}
		else {
			System.out.println(str1 + "does not contain "+str3);
		}
	}

}
