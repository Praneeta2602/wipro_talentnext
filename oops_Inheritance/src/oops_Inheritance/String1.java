package oops_Inheritance;
import java.util.*;
public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			    Scanner sc = new Scanner(System.in);
			    String s = sc.nextLine();
			    String rev="";
		 s=	s.toLowerCase();	
		 for(int i=s.length()-1;i>=0;i--){
		     rev = rev+ s.charAt(i);
		 }
		 
		 if(s.equals(rev)){
		 System.out.println("its a palindrome");
		}
		else{
		   System.out.println("its not a plaindrome");
		}
		 
		}
}	 
	
