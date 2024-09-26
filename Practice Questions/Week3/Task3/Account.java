package Task3;

public class Account {
    // Instance variables
    private int id; // Unique identifier for the account
    private Customer customer; // Reference to the associated Customer object
    private double balance = 0.0; // Account balance, initialized to zero

    // Constructor that initializes the account with an id, customer, and balance
    public Account(int id, Customer customer, double balance) {
        this.id = id; // Set the account id
        this.customer = customer; // Set the associated customer
        this.balance = balance; // Set the initial balance
    }

    // Constructor that initializes the account with an id and customer, defaulting balance to zero
    public Account(int id, Customer customer) {
        this.id = id; // Set the account id
        this.customer = customer; // Set the associated customer
    }

    // Getter method to retrieve the account id
    public int getID() {
        return id; // Return the account id
    }

    // Getter method to retrieve the associated customer
    public Customer getCustomer() {
        return customer; // Return the Customer object
    }

    // Getter method to retrieve the current balance
    public double getBalance() {
        return balance; // Return the current balance
    }

    // Setter method to update the balance
    public void setBalance(double balance) {
        this.balance = balance; // Update the balance
    }

    // toString method to provide a string representation of the account
    public String toString() {
        return "Account[id=" + id + ", customer=" + customer + ", balance=" + balance + "]"; // Format the account details
    }

    // Method to retrieve the name of the associated customer
    public String getCustomerName() {
        return customer.getName(); // Call the getName method on the Customer object
    }

    // Method to deposit an amount into the account
    public double deposit(double amount) {
        balance += amount; // Increase the balance by the deposit amount
        return balance; // Return the updated balance
    }

    // Method to withdraw an amount from the account
    public double withdraw(double amount) {
        // Check if the withdrawal amount exceeds the current balance
        if (balance >= amount) {
            balance -= amount; // Decrease the balance by the withdrawal amount
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!"); // Print a warning message
        }
        return balance; // Return the updated balance
    }
}
