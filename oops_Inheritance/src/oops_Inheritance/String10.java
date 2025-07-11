package oops_Inheritance;

import java.util.Scanner;

public class String10{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=sc.nextInt();
		int len=s.length();
		String result="";
        String s1=s.substring(len-n);
		for(int i=0;i<n;i++) {
			result+=s1;
		}
		System.out.print(result);
			
		}

	}