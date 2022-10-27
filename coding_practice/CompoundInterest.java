import java.util.Scanner;
import java.lang.Math;
public class CompoundInterest{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		double p,r,n,t,ci,nt,rn;
		
		System.out.println("Enter the initial amount");
		p=sc.nextInt();
		System.out.println("Enter the anual interest rate");
		r=sc.nextInt();
		System.out.println("Enter the time");
		t=sc.nextInt();
		System.out.println("Enter the compounding rate");
		n=sc.nextInt();
		nt=n*t;
		rn=(r/n)+1;
		ci=(p*( Math.pow(rn,nt)))-p;
		System.out.println("the ci is"+ci);
}
}