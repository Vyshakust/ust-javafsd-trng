package Interface;

interface Polygoninterface {
	void getArea();
	
	default void getSides() {
		System.out.println("I can get sides of a polygon");
	}
}


class Rectangle implements Polygoninterface{
	public void getArea() {
		int length =6;
		int breadth =5;
		int area = length * breadth;
		System.out.println("The area of the rectangle is "+ area);
	}
	public void getSlides() {
		System.out.println("I have 4 sides");
	}
}

class Square implements Polygoninterface{
	public void getArea() {
		int length =5;
		int area = length*length;
		System.out.println("The area of the square is"+area);
	}
}

class Main61{
	public static void main(String args[]) {
		Rectangle r1=new Rectangle();
		r1.getArea();
		r1.getSlides();
		
		Square s1 = new Square();
		s1.getArea();
		s1.getSides();
	}
}