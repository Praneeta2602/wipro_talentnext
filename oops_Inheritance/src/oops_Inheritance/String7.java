package oops_Inheritance;
import java.util.*;
public class String7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  String s = sc.nextLine();
  if(s.charAt(0)=='x') {
	  s=s.substring(1);
	}
  if(s.length()>0 && s.charAt(s.length()-1)=='x') {
	  s= s.substring(0, s.length()-1);
  }
  System.out.println(s);
	}
}
