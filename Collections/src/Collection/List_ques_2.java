package Collection;

import java.util.*;

// a) Employee class
class Employee3 {
    int empid;
    String empName;
    String email;
    String gender;
    float salary;

    // Constructor
    public Employee3(int empid, String empName, String email, String gender, float salary) {
        this.empid = empid;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    // Method to print employee details
    void GetEmployeeDetails() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + empName);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("Salary: ₹" + salary);
    }
}

// b) EmployeeDB class
class EmployeeDB {
    ArrayList<Employee3> list = new ArrayList<>();

    // Add employee
    boolean addEmployee(Employee3 e) {
        return list.add(e);
    }

    // Delete employee by empid
    boolean deleteEmployee(int empId) {
        Iterator<Employee3> iterator = list.iterator();
        while (iterator.hasNext()) {
            Employee3 emp = iterator.next();
            if (emp.empid == empId) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    // Show payslip for empid
    String showPaySlip(int empId) {
        for (Employee3 emp : list) {
            if (emp.empid == empId) {
                return "Pay slip for employee ID " + empId + ": ₹" + emp.salary;
            }
        }
        return "Employee not found.";
    }

    // Optional: Display all employees
    void displayAllEmployees() {
        for (Employee3 emp : list) {
            emp.GetEmployeeDetails();
            System.out.println("----------------------");
        }
    }
}

// Main class to test the program
public class List_ques_2 {
    public static void main(String[] args) {
        EmployeeDB db = new EmployeeDB();

        // Create employees
        Employee3 e1 = new Employee3(101, "Alice", "alice@example.com", "Female", 50000f);
        Employee3 e2 = new Employee3(102, "Bob", "bob@example.com", "Male", 60000f);
        Employee3 e3 = new Employee3(103, "Charlie", "charlie@example.com", "Male", 55000f);

        // Add employees
        db.addEmployee(e1);
        db.addEmployee(e2);
        db.addEmployee(e3);

        // Display all employees
        System.out.println("All Employees:");
        db.displayAllEmployees();

        // Show payslip
        System.out.println(db.showPaySlip(102));

        // Delete employee
        boolean deleted = db.deleteEmployee(101);
        System.out.println("Employee 101 deleted: " + deleted);

        // Display remaining employees
        System.out.println("\nRemaining Employees:");
        db.displayAllEmployees();
    }
}