package Loops;

public class Sum1000 {
	public static void main(String args[]) {
		int x=1;
		int sum=0;
		for(int i=0;i<1000;i++) {
			sum=sum+x;
			x++;
		}
		System.out.println(sum);
		
	}

}
