import java.util.Scanner;
public class Exchangerows{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and coloumns");
		int r,c,cb;
		r=sc.nextInt();
		c=sc.nextInt();
		cb=c-1;
		int arr[][]=new int[r][c];
		int temp[]=new int[c];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The array is ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("After exchanging rows");
		for(int i=0;i<c;i++)
		{
			temp[i]=arr[0][i];
			arr[0][i]=arr[r-1][i];
			arr[r-1][i]=temp[i];
		}
		
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

		

}
}
		
			
		
		

		