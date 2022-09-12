package SBA;

abstract class Employee1 {
	
	abstract void calculateSalary();
	
	abstract void fetchdepartment();
	
}

class Engineer1 extends Employee1{
	void calculateSalary() {
		System.out.println("Salary of engineer");
		
	}
	
	void fetchdepartment() {
		System.out.println("Department of engineer");
		
	}
}



class Doctor extends Employee1{
	
	void calculateSalary() {
		System.out.println("Salary of doctor");
		
		
	}
	
	void fetchdepartment() {
		System.out.println("Department of doctor");
		
	}
	
}


class Main1{
	public static void main(String args[]) {
		Engineer1 e1=new Engineer1();
		Doctor d1=new Doctor();
		e1.calculateSalary();
		e1.fetchdepartment();
		d1.calculateSalary();
		d1.fetchdepartment();
		
	}
	
}
