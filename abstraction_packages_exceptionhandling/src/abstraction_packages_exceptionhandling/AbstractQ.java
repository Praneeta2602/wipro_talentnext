package abstraction_packages_exceptionhandling;

import java.util.*;

abstract class Compartment {
	public abstract String notice();
}

class FirstClass extends Compartment {
	public String notice() {
		return "FirstClass Compartment";
	}
}

class Ladies extends Compartment {
	public String notice() {
		return "Ladies Compartment";
	}
}

class General extends Compartment {
	public String notice() {
		return "General Compartment";
	}
}

class Luggage extends Compartment {
	public String notice() {
		return "Luggage Compartment";
	}
}

public class AbstractQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment arr[] = new Compartment[10];
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			int n = ran.nextInt(4) + 1;
			switch (n) {
			case 1:
				arr[i] = new FirstClass();
				break;
			case 2:
				arr[i] = new Ladies();
				break;
			case 3:
				arr[i] = new General();
				break;
			case 4:
				arr[i] = new Luggage();
				break;
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Compartment "+(i+1)+": "+arr[i].notice());
		}

	}

}