package com.ust;

public class Labelled_break {
	public static void main(String args[]) {
		first:
		for(int i=0;i<5;i++) {
			
			second:
			for(int j=0;j<5;j++) {
				System.out.println("i="+i+ ";j="+j);
				if(i==2) {
					break first;
				}
			}
			
		}
	}

}
