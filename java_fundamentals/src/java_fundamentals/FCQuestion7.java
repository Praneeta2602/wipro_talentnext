package java_fundamentals;

public class FCQuestion7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        char ch = 'a'; 

		        if (ch >= 'a' && ch <= 'z') {
		            char upper = Character.toUpperCase(ch);
		            System.out.println(ch + "->" + upper);
		        } else if (ch >= 'A' && ch <= 'Z') {
		            char lower = Character.toLowerCase(ch);
		            System.out.println(ch + "->" + lower);
		        } else {
		            System.out.println("Not an alphabet character.");
		        }


	}

}
