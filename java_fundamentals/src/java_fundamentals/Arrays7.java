package java_fundamentals;
import java.util.*;
public class Arrays7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  
		        Scanner sc = new Scanner(System.in);

		        // Ask the user for the size of the array
		        System.out.print("Enter the size of the array: ");
		        int n = sc.nextInt();

		        int[] arr = new int[n];

		        // Ask the user to enter each number
		        System.out.println("Enter the numbers (can be in any order):");
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }

		        // Sort the array first
		        Arrays.sort(arr);

		        // Two pointer method to remove duplicates
		        int i = 0;
		        for (int j = 1; j < n; j++) {
		            if (arr[j] != arr[i]) {
		                arr[i + 1] = arr[j];
		                i++;
		            }
		        }

		        // Print the number of unique elements
		        System.out.println("Number of unique elements: " + (i + 1));

		        // Print the unique elements
		        System.out.print("Array after removing duplicates: ");
		        for (int k = 0; k <= i; k++) {
		            System.out.print(arr[k] + " ");
		        }

		   
		    }
		}


		
		    
