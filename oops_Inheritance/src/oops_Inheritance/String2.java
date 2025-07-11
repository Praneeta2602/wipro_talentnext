package oops_Inheritance;
import java.util.*;
public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner sc = new Scanner(System.in);

		      
		        String str1 = sc.nextLine();
		        String str2 = sc.nextLine();

		       
		        str1 = str1.toLowerCase();
		        str2 = str2.toLowerCase();

		        String result="";

		      
		        if(str1.charAt(str1.length()-1) == str2.charAt(0)) {
		            // Remove one duplicate character
		            result = str1 + str2.substring(1);
		        } else {
		            result = str1 + str2;
		        }

		        System.out.println(result);
		    }
		}



