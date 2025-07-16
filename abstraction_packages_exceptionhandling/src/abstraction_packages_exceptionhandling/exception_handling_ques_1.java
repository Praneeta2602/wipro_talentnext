package abstraction_packages_exceptionhandling;

import java.util.*;

public class exception_handling_ques_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the number of elements in the array");
		
			int n=sc.nextInt();
			int arr[]=new int[n];
			System.out.println("Enter the elements in the array");
			for(int i=0;i<n;i++) {
				String element=sc.next();
				arr[i]=Integer.parseInt(element);
//				arr[i]=sc.nextInt();
			}
			System.out.println("Enter the index of the array element you want to access");
			int index=sc.nextInt();
			System.out.println("The array element at index "+index+" = "+arr[index]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println(e);
		}
//		catch(InputMismatchException e) {
//			System.out.println(e);
//		}

	}

}