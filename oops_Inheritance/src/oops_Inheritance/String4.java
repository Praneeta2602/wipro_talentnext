package oops_Inheritance;
import java.util.*;
public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = s.length();
		if(n%2==0) {
			System.out.println(s.substring(0,n/2));
		
		}
		if(s.length()%2!=0) {
			System.out.println("null");
		}

	}

}
