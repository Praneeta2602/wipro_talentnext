package java_fundamentals;

import java.util.*;
public class Arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter the size of the array: ");
	    int n = sc.nextInt(); 
	    System.out.println("enter the serach element: ");
	    int target = sc.nextInt();
	    System.out.println("enter the values:");
	    int[] arr = new int[n];// initializeing the array
	    //input the value of arrays
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	        }
	        for(int i=0;i<n;i++){
	        if(arr[i]==target){
	            System.out.println(i);
	            return;
	        }
	       
	        }
	        
	        System.out.println("-1");
	         
	

	}

}
