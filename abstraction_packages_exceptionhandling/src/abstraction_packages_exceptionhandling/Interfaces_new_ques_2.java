package abstraction_packages_exceptionhandling;




interface Test{
	abstract int myFunction(int a,int b,int c);
}

public class Interfaces_new_ques_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=(num1,num2,num3)->num1+num2+num3;
		
		Test t2=(num1,num2,num3)->num1*num2*num3;
		System.out.println("Sum: "+t1.myFunction(2, 3, 3));
		System.out.println("Product: "+t2.myFunction(2, 2, 2));
	}

}