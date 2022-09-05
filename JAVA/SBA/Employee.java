package SBA;

public class Employee {
	int empid;
	String empname;
	int exp;
	float salary1=1000f;
	
	void salary() {
		
		System.out.println("the salary of employee is "+salary1);
		
	}
	
	void salary(int exp) {
		salary1=3000;
		System.out.println("the salary of employee with experience  "+exp+" years is "+salary1+"overloading");
	}
	

	public static void main(String args[]) {
		Engineer e1=new Engineer();
		e1.salary();
		Engineer e2=new Engineer();
		e2.salary(3);
		
	}
}

class Engineer extends Employee{
	void salary() {
		super.salary();
		salary1=2000;
		System.out.println("the salary of engineer is(overriding)"+salary1);
		
		
	}
}

