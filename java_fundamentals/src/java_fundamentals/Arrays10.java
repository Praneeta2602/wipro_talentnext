package java_fundamentals;
import java.util.*;
public class Arrays10 {

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

		        // Create a new array to store the result
		        int[] result = new int[n];
		        int index = 0;

		        // First, put even numbers in result
		        for (int i = 0; i < n; i++) {
		            if (arr[i] % 2 == 0) {
		                result[index] = arr[i];
		                index++;
		            }
		        }

		        // Then, put odd numbers in result
		        for (int i = 0; i < n; i++) {
		            if (arr[i] % 2 != 0) {
		                result[index] = arr[i];
		                index++;
		            }
		        }

		        // Print the rearranged array
		        System.out.print("Rearranged array: ");
		        for (int i = 0; i < n; i++) {
		            System.out.print(result[i] + " ");
		        }

		        sc.close(); // good practice to close Scanner
		    }
		}
