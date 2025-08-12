package Collection;

import java.util.*;
public class Set_ques_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> data=new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		data.add("banana");
		data.add("Apple");
		data.add("cherry");
		data.add("dragon fruit");
		System.out.println("Before reversing the treeset: "+data);
		System.out.println("After reversing the treeset "+data.descendingSet());
		Iterator<String> itr=data.iterator();
		String target="apple";
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		if (target.contains(target)) {
			System.out.println("The " + target + " is found in the treeset");
		} else {
			System.out.println("The " + target + " is not found in the treeset");
		}
	}

}