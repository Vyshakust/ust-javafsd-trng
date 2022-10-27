import java.util.Scanner;
public class Booleanarray{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	boolean arr[][]=new boolean[3][3];
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			arr[i][j]=sc.nextBoolean();
		}
	}

	for(int i=0;i<2;i++){
		for(int j=0;j<3;j++){
			if(arr[i][j]==true){
				System.out.print("t");
			}
			else
				System.out.print("f");
		}
		System.out.println();
	}
	
	
	}

}