package Practice.Week3.Task3;

public class Customer {
    // Instance variables
    private int ID; // Unique identifier for the customer
    private String name; // Name of the customer
    private char gender; // Gender of the customer (for Task3.b - Account)
    private int discount; // Discount percentage for the customer (for Task3.a - Invoice)

    // Constructor for creating a Customer object with ID, name, and discount
    public Customer(int ID, String name, int discount) {
        this.ID = ID; // Initialize the customer ID
        this.name = name; // Initialize the customer name
        this.discount = discount; // Initialize the discount percentage
    }

    // Getter method to retrieve the customer ID
    public int getID() {
        return ID; // Return the customer ID
    }

    // Getter method to retrieve the customer name
    public String getName() {
        return name; // Return the customer name
    }

    // Getter method to retrieve the customer gender
    public char getGender() {
        return gender; // Return the gender of the customer
    }

    // Getter method to retrieve the discount percentage
    public int getDiscount() {
        return discount; // Return the discount percentage
    }

    // Setter method to update the discount percentage
    public void setDiscount(int discount) {
        this.discount = discount; // Update the discount
    }

    // toString method to provide a string representation of the customer
    public String toString() {
        return "Customer[ID: " + ID + ", Name: " + name + ", Gender: " + gender + ", Discount: " + discount + "%]"; // Format customer details
    }
}
