package Interface;

import java.io.*;

class Autoandunboxing {
	public static void main(String args[]) {
		Integer i= new Integer(10);//Boxing
		
		int i1=i;//unboxing
		
		System.out.println("Value of i :" +i);
		System.out.println("Value of i1: " +i1);
		
		Character X= 'a';//Boxing
		
		char ch= X;//unboxing
		
		System.out.println("Value of ch :" +ch);
		System.out.println("Value of x:" +X);
	}

}
