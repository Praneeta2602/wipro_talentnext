package java_fundamentals;
import java.util.*;
public class FCQuestion3 {

	public static void main(String[] args) {
		int arr[] = new int[3];
		// TODO Auto-generated method stub
if(arr.length==0) {
	System.out.println("No values");
}
else if(arr.length==1) {
	System.out.println(args[0]);
}
else if(arr.length==2) {
	System.out.println(args[0]+", "+args[1]);
}
else if(arr.length==3) {
	System.out.println(args[0]+", "+args[1]+", "+args[2]);
}
else {
	System.out.println(args[0]+args[1]+args[2]+args[3]+args[4]);
}
	}

}
