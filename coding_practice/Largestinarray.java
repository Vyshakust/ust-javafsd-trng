import java.util.Scanner;

public class Largestinarray{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int arr[]=new int[4];
		int l;
		for(int i=0;i<4;i++){
			arr[i]=sc.nextInt();
		}
		l=arr[0];
		for(int i=0;i<4;i++)
		{
			if(arr[i]>l)
				l=arr[i];
		}
		System.out.println("The largest element is"+l);
}
}
			