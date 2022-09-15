package Generic;

 class Test2<T> {
	 T obj;
	 Test2(T obj){this.obj = obj;}
	 public T getObject() {return this.obj;}

}
 
 class Main{
	 public static void main(String args[]) {
		 Test2<Integer>iObj= new Test2<Integer>(15);
		 System.out.println(iObj.getObject());
		 Test2<String>sObj=new Test2<String>("Geek for Geeks");
		 System.out.println(sObj.getObject());
		 iObj = sObj;
		 
	 }
 }
