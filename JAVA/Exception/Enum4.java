package Enum;

enum Size4{
	SMALL,MEDIUM,LARGE,EXTRALARGE;


public String getSize() {
	switch(this) {
	case SMALL:
		return "SMALL";
		
	case MEDIUM:
		return "MEDIUM";
		
	case LARGE:
		return "LARGE";
	
	case EXTRALARGE:
		return "EXTRALARGE";
	default:
		return null;
		
	}
	}

	public static void main(String args[]) {
		System.out.println("The size of the pizza is "+Size4.SMALL.getSize());
	}


}	




