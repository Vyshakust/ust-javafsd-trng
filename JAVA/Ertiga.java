package com.ust;

class Car{
 String model;
 String col;
 int wheels;
 int seat;
 String geartype;
 
 
 void dispaly() {
	System.out.println("In car class") ;
	 
 }
 

}

class Ciaz extends Car{
	void display(){
		System.out.println("in ciaz class ");
	}



 void show() {
	 System.out.println("in show method ");
	 
 }
}



public class Ertiga extends Car {
	void display() {
		System.out.println("in ciaz class ");
		super.dispaly();
	}
	
	public static void main(String args[]) {
		Ciaz c= new Ciaz();
		
		
		c.dispaly();
		c.show();
		
		Ertiga e= new Ertiga();
		e.display();System.out.println(e.col);
		
		
	}
}
