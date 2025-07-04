package java_fundamentals;

import java.util.Scanner;

public class FCQuestion1 {

	public static void main(String[] args) {
		//A
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a<0) {
				System.out.println("Negative");
		}
		else if(a>0)
		{
			System.out.println("Positive");
		}
		else {
			System.out.println("Zero");
		}
		
		//B
		/*Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
	
		int Lastdig1 = a%10;
		int Lastdig2= b%10;
		
		if(Lastdig1==Lastdig2) {
			System.out.println("True");
			}
		else {
			System.out.println("False");
		} */
		}

}
