import java.util.Scanner;

public class Stringtoarray{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s;
		int l;
		s=sc.nextLine();
		l=s.length();
		char arr[]= new char[l];
		for(int i=0;i<l;i++){
			arr[i]=s.charAt(i);
			}
		for(int i=0;i<l;i++){
			System.out.print(arr[i]+",");
		}
}
}
		