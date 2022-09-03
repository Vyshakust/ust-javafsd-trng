package day2set2;
import java .util.Arrays;


public class Arrlen {
	public static void main(String args[]) {
		int arr1[]= {1,2,3};
		int arr2[]= {4,5,6};
		int alen1=arr1.length;
		int alen2=arr2.length;
		
		int result[]=new int[alen1+alen2];
		
		System.arraycopy(arr1, 0, result, 0, alen1);
		System.arraycopy(arr2,0,result,alen1,alen2);
		System.out.println(Arrays.toString(result));
	}

}
