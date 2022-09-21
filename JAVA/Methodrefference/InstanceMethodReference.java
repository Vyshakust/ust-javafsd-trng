package Methodrefference;


import java.util.function.BiFunction;
class Arithematic{
	public int add(int a,int b) {
		return a+b;
	}
}
public class InstanceMethodReference {
	public static void main(String args[]) {
		BiFunction<Integer,Integer,Integer>adder=new Arithematic()::add;
		int result = adder.apply(10, 20);
		System.out.println(result);
	}
	

}