package oops_Inheritance;

import java.util.Optional;

//Custom Exception
class InvalidEmployeeException extends Exception {
 public InvalidEmployeeException(String message) {
     super(message);
 }
}


class Employees{
 private String name;

 public Employees(String name) {
     this.name = name;
 }

 public String getName() {
     return name;
 }
}

//Main class to test
public class OptionalclassQ {

 public static void main(String[] args) {
     Employee emp = null; // Or: new Employee("John");

     try {
         // Use Optional to check and throw exception if null
         Employee validEmployee = Optional.ofNullable(emp)
                 .orElseThrow(() -> new InvalidEmployeeException("Employee is invalid or null"));

         System.out.println("Employee Name: " + validEmployee.getName());
     } catch (InvalidEmployeeException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}