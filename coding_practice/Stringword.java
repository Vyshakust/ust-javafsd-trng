import java.util.*;
public class Stringword{
	public static void main(String args[])
	{
		 String str,str1,str2;
		str1=" ";
		str2=" ";
	Scanner sc= new Scanner(System.in);
	str=sc.nextLine();
	for(int i=0;i<str.length();i++)
	{
		if(i==(str.length()-1)){
			StringBuilder sb=new StringBuilder(str1);  
    			sb.reverse(); 
			sb.toString();
			str2=str2+sb;
			str1=" ";
		}

		else if(str.charAt(i)!=' ')
		{
			str1=str1+str.charAt(i);
			
		}
		else{
			System.out.println(str1);
			StringBuilder sb=new StringBuilder(str1);  
    			sb.reverse(); 
			sb.toString();
			str2=str2+sb;
			str1=" ";
		}
	}
	System.out.println(str2);
}
}				