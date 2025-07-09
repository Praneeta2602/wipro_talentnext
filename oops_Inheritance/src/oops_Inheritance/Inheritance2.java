package oops_Inheritance;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    // Getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    private double annualSalary;
    private int yearStarted;
    private String insuranceNumber;

    public Employee(String name, double annualSalary, int yearStarted, String insuranceNumber) {
        super(name);  // call parent constructor
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.insuranceNumber = insuranceNumber;
    }

    // Getters and setters
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public void displayEmployeeDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Annual Salary: " + annualSalary);
        System.out.println("Year Started: " + yearStarted);
        System.out.println("Insurance Number: " + insuranceNumber);
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("Anu", 750000.00, 2023, "INS12345");

        // Display all employee details
        emp.displayEmployeeDetails();
    }
}
