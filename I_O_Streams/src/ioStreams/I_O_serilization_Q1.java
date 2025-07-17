package ioStreams;

import java.io.*;
import java.util.Date;


// Employee class implementing Serializable
class Employee implements Serializable {
    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;

    // No-argument constructor
    public Employee() {}

    // Parameterized constructor
    public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Date getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(Date dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Employee{" +
               "name='" + name + '\'' +
               ", dateOfBirth=" + dateOfBirth +
               ", department='" + department + '\'' +
               ", designation='" + designation + '\'' +
               ", salary=" + salary +
               '}';
    }
}

public class I_O_serilization_Q1 {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("John Doe", new Date(), "IT", "Software Engineer", 75000.0);

        // Serialize the object to a file named "data"
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data"))) {
            oos.writeObject(emp);
            System.out.println("Employee object has been serialized to 'data'.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object from the file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data"))) {
            Employee deserializedEmp = (Employee) ois.readObject();
            System.out.println("Deserialized Employee object:");
            System.out.println(deserializedEmp);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}