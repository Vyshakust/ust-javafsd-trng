import java.util.*;


public class Pangram{
	public static void main(String args[]){
		Scanner sc =  new Scanner(System.in);
		String st;
		st=sc.nextLine();
		st=st.toLowerCase();
		
		Set <Character> set1=new HashSet<>();
		for(int i=0;i<st.length();i++){
			set1.add(st.charAt(i));
		}
		if(set1.size()<26){
			System.out.println("not a pangram");
		}
		else
			System.out.println("pangram");
}
}
