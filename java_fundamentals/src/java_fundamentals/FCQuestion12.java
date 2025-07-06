package java_fundamentals;

import java.util.Scanner;

public class FCQuestion12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();// change this to test with other numbers
		        int cnt = 0;

		        for (int i = 1; i <= Math.sqrt(n); i++) {
		            if (n % i == 0) {
		                cnt = cnt + 1; // count i as a divisor
		                if (n / i != i) {
		                    cnt = cnt + 1; // count the pair divisor n/i if it's different
		                }
		            }

		            if (cnt > 2) {
		                break; // no need to continue, number has more than 2 divisors
		            }
		        }

		        if (cnt == 2) {
		            System.out.println(n + " is a prime number.");
		        } else {
		            System.out.println(n + " is not a prime number.");
		        }
		    }
	

	

}
