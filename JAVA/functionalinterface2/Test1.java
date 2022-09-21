package functionalinterface2;

@FunctionalInterface

interface Square{
	int calculate(int x);
}
class Test1 {
	public static void main(String args[])
	{
		int a= 5;
		Square s= (int x)->x*x;
		int ans = s.calculate(a);
		System.out.println(ans);
	}
}
