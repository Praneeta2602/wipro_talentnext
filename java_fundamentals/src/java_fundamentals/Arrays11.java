package java_fundamentals;
import java.util.*;
public class Arrays11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);

		        // Ask user for the size of the array
		        System.out.print("Enter the size of the array: ");
		        int n = sc.nextInt();

		        int[] arr = new int[n];

		        // Ask user to enter the numbers
		        System.out.println("Enter the numbers:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }

		        // Check if every element is 1 or 4
		        boolean only14 = true; // assume true at start

		        for (int i = 0; i < n; i++) {
		            if (arr[i] != 1 && arr[i] != 4) {
		                only14 = false; // found an element that is not 1 or 4
		                break;
		            }
		        }

		        // Print the result
		        System.out.println(only14);

		        sc.close(); // good practice to close Scanner
		    }
		}

	
