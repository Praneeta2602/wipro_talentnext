package java_fundamentals;
import java.util.*;
public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			    Scanner sc = new Scanner(System.in);
			    int n = sc.nextInt();
			    int sum =0;
			    int[] arr = new int[n];
			    for(int i=0;i<n;i++){
			        arr[i]=sc.nextInt();
			       sum=sum+arr[i]; 
			    }
			    int avg = sum/n;
			    System.out.println("the sum is "+ sum+" avg is: "+avg);
			}
		
	

}
