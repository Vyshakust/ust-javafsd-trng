package SBA;


interface Employee2 {
	
	abstract void calculateSalary();
	
	abstract void fetchdepartment();
	
}

class Engineer3 implements Employee2{
	public void calculateSalary() {
		System.out.println("Salary of engineer");
		
	}
	
	public void fetchdepartment() {
		System.out.println("Department of engineer");
		
	}
}



class Doctor1 implements Employee2{
	
	public void calculateSalary() {
		System.out.println("Salary of doctor");
		
		
	}
	
	public void fetchdepartment() {
		System.out.println("Department of doctor");
		
	}
	
}


class Main2{
	public static void main(String args[]) {
		Engineer1 e1=new Engineer1();
		Doctor d1=new Doctor();
		e1.calculateSalary();
		e1.fetchdepartment();
		d1.calculateSalary();
		d1.fetchdepartment();
		
	}
	
}
