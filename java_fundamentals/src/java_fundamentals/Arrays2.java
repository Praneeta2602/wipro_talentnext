package java_fundamentals;
import java.util.*;
public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt(); //inmput the size of the array
	    
	    int[] arr = new int[n];// initializeing the array
	    //input the value of arrays
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	        }
	        int max =arr[0];
	        int min=arr[0];
	        //find the max & min
	        for(int i=0;i<n;i++){
	            if(arr[i]>max){
	                max = arr[i];
	            }
	            if(arr[i]<min){
	                min = arr[i];
	            }
	            
	        }
	  
	    System.out.println("the min and max values are: "+ min+","+max);
	}
}

	

