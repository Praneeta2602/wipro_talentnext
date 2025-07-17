package ioStreams;


import java.io.*;
import java.util.*;

class Employee3 implements Serializable {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee3(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + age + " " + salary;
    }
}

public class Mini_project_iostreams {
    private static final String FILE_NAME = "employees.dat";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee3> employeeList = loadEmployees();

        while (true) {
            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addEmployee(scanner, employeeList);
                    saveEmployees(employeeList);
                    break;
                case 2:
                    displayEmployees(employeeList);
                    break;
                case 3:
                    System.out.println("Exiting the System");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addEmployee(Scanner scanner, List<Employee3> employeeList) {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        Employee3 emp = new Employee3(id, name, age, salary);
        employeeList.add(emp);
        System.out.println("Employee added successfully.\n");
    }

    private static void displayEmployees(List<Employee3> employeeList) {
        System.out.println("----Report-----");
        for (Employee3 emp : employeeList) {
            System.out.println(emp);
        }
        System.out.println("----End of Report-----\n");
    }

    private static void saveEmployees(List<Employee3> employeeList) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employeeList);
        } catch (IOException e) {
            System.out.println("Error saving employees: " + e.getMessage());
        }
    }

    private static List<Employee3> loadEmployees() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Employee3>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading employees: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}