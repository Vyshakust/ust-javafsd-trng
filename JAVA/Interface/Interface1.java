package Interface;

interface Interface1 {
	void getName(String name);
}


class ProgrammingLanguage implements Interface1{
	public void getName(String name) {
		System.out.println("Programming Languavge:"+name);
	}
	
}

class Main{
	public static void main(String args[]) {
		ProgrammingLanguage Interface1 = new ProgrammingLanguage();
		Interface1.getName("Java");
	}
}