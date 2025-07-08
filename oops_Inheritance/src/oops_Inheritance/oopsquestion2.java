package oops_Inheritance;

public class oopsquestion2 {

		    static class Calculator {
		        public static int powerInt(int num1, int num2) {
		            return (int) Math.pow(num1, num2);
		        }

		        public static double powerDouble(double num1, double num2) {
		            return Math.pow(num1, num2);
		        }
		    }

		    public static void main(String[] args) {
		        int intResult = Calculator.powerInt(2, 3);           
		        double doubleResult = Calculator.powerDouble(2.5, 3);

		        System.out.println("powerInt(2, 3) = " + intResult);
		        System.out.println("powerDouble(2.5, 3) = " + doubleResult);
		    }
		}

	


