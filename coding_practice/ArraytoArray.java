import java.util.Scanner;
public class ArraytoArray{
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];
		int l;
		l=arr.length;
		int arr2[]=new int[l];
		for(int i=0;i<l;i++){
			System.out.println("Enter element");
			arr[i]=sc.nextInt();
			}
		for(int i=0;i<l;i++)
		{
			arr2[i]=arr[i];
		}
		for(int i=0;i<l;i++)
		{
			System.out.println(arr2[i]);
		}
		}
}
		