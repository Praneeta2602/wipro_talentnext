package oops_Inheritance;

import java.util.Scanner;

public class String6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String str1 = sc.nextLine();
String str2 = sc.nextLine();
int l1 = str1.length();
int l2 = str2.length();
if(l1<l2) {
System.out.println(str1+str2+str1);
}
else {
	System.out.println(str2+str1+str2);
}
	}

}
