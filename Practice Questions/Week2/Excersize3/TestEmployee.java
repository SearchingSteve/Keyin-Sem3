package Excersize3;
public class TestEmployee {
    
    public static void main(String[] args) {
        // Create two Employee objects using the parameterized constructor
        Employee e1 = new Employee(1, "John", "Appleseed", 4500);
        Employee e2 = new Employee(2, "James", "Doe", 5000);
        
        // Perform Methods for Employee 1
        System.out.println("Employee 1:");
        System.out.println("ID: " + e1.getID());
        System.out.println("First Name: " + e1.getFirstName());
        System.out.println("Last Name: " + e1.getLastName());
        System.out.println("Name: " + e1.getName());
        System.out.println("Salary: " + e1.getSalary());
        System.out.println("Annual Salary: " + e1.getAnnualSalary());
        System.out.println("Raise Salary: " + e1.raiseSalary(20));
        System.out.println("Annual Salary: " + e1.getAnnualSalary());
        System.out.println(e1.toString());
        
        // Perform Methods for Employee 2
        System.out.println("\nEmployee 2:");
        System.out.println("ID: " + e2.getID());
        System.out.println("First Name: " + e2.getFirstName());
        System.out.println("Last Name: " + e2.getLastName());
        System.out.println("Name: " + e2.getName());
        System.out.println("Salary: " + e2.getSalary());
        System.out.println("Annual Salary: " + e2.getAnnualSalary());
        System.out.println("Raise Salary: " + e2.raiseSalary(20));
        System.out.println("Annual Salary: " + e2.getAnnualSalary());
        System.out.println(e2.toString());
    }
}
