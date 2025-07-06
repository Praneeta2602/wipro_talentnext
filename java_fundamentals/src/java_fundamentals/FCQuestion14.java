package java_fundamentals;
import java.util.*;
public class FCQuestion14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();   // Input number
		        int sum = 0;
		        for(;n>0;n=n/10){
		           int LD = n%10;
		            sum=sum+LD;
		        }
		        System.out.println(sum);
		    
	}

}
