import java.util.Scanner;
public class Solution2{
	public static void main(String args[]){
		double d1,d2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two double numbers");
		d1=sc.nextDouble();
		d2=sc.nextDouble();
		if(d1>0&&d1<1){
			if(d2>0&&d2<1){
				System.out.println("True");
			}
			else
				System.out.println("False");
		}
		else
			System.out.println("False");

		
	
	}
}