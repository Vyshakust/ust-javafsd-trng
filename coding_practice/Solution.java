import java.util.Scanner;
public class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Enter the four numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		if(a==b&&b==c&&c==d){
			System.out.println("The numbers are equal");
		}
		else{
			System.out.println("the numbers are not equal");
		}
			
		

	}
}