import java.util.Scanner;

public class String1{

	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		String s;
		int n;
		System.out.println("Enter the string");
		s=sc.nextLine();
		System.out.println("Enter the index");
		n=sc.nextInt();
		System.out.println("The required char is "+s.charAt(n));
		}
}
		
		