package Collection;


import java.util.*;
public class List_ques_5 {

	public static void main(String[] args) {

		List<String> months=new LinkedList<String>();
		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");
//		months.remove("June");
//		months.add(5, "Mid-June");
		System.out.println("Months of the Year:");
        for (String month : months) {
            System.out.println(month);
        }
//		System.out.println(months);
	}

}