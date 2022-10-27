import java.util.Scanner;
import java.util.*;
import java.lang.String;
public class Arraytostring{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s;
		int arr[]=new int[4];
		for(int i=0;i<4;i++){
			arr[i]=sc.nextInt();
			}
		s=Arrays.toString(arr);
		System.out.println(s);
		System.out.println(s.getClass());
}
}
		
		
			
	