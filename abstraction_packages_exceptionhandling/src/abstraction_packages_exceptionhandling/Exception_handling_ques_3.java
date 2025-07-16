package abstraction_packages_exceptionhandling;
import java.util.*;


class NegativeValueException extends Exception{
	public NegativeValueException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}

class outofRangeException extends Exception{
	public outofRangeException(String message){
		super(message);
	}
}

public class Exception_handling_ques_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		final int no_of_students=2;
		final int no_of_subjects=3;
		for(int i=1;i<=no_of_students;i++) {
			System.out.println("Enter name of the student "+i+": ");
			String name=sc.nextLine();
			int[] marks=new int[no_of_subjects];
			int total=0;
			for(int j=0;j<no_of_subjects;j++) {
				while(true) {
					System.out.println("Enter marks for subjects "+(j+1)+": ");
					String input=sc.nextLine();
					try {
						int mark=Integer.parseInt(input);
						if(mark<0) {
							throw new NegativeValueException("Marks cannot be negative");
						}
						if(mark>100) {
							throw new outofRangeException("Marks must be between 0 and 100");
						}
						marks[j]=mark;
						total += mark;
						break;
					}catch(NumberFormatException e) {
						System.out.println("Invalid input! please enter an integer");
					}catch(NegativeValueException | outofRangeException e) {
						System.out.println("Error: "+e.getMessage());
					}
				}
			}
			double avg=total/(double) no_of_subjects;
			System.out.println("Average marks for "+name+": "+avg);
			System.out.println("---------------------------------");
		}
	}

}