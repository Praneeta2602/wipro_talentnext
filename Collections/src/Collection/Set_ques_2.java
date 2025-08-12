package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Set_ques_2 {

    public static void main(String[] args) {
        // Create a HashSet to store employee names
        HashSet<String> employeeNames = new HashSet<>();

        // Add employee names to the HashSet
        employeeNames.add("Alice");
        employeeNames.add("Bob");
        employeeNames.add("Charlie");
        employeeNames.add("Diana");
        employeeNames.add("Ethan");

        // Display the HashSet
        System.out.println("Employee names stored in HashSet:");
        
        // Retrieve elements using Iterator
        Iterator<String> iterator = employeeNames.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}