package Collection;

import java.util.ArrayList;

public class List_ques_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Number> numbers=new ArrayList<Number>();
		numbers.add(10); 
		numbers.add(15.5f); 
		numbers.add(99.99); 
		numbers.add((short) 5); 
		numbers.add(123456789L);
		numbers.add((byte) 8); 

		System.out.println("Numeric values in the list:");
		for (Number num : numbers) {
			System.out.println(num);
		}
	
	}

}