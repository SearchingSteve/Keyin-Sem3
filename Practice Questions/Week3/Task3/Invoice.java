package Task3;

public class Invoice {
    // Instance variables
    private int ID; // Unique identifier for the invoice
    private Customer customer; // Customer associated with the invoice
    private double amount; // Total amount for the invoice

    // Constructor to initialize an Invoice object with ID, customer, and amount
    public Invoice(int ID, Customer customer, double amount) {
        this.ID = ID; // Initialize the invoice ID
        this.customer = customer; // Associate the customer with this invoice
        this.amount = amount; // Set the invoice amount
    }

    // Getter method to retrieve the invoice ID
    public int getID() {
        return ID; // Return the invoice ID
    }

    // Getter method to retrieve the associated customer
    public Customer getCustomer() {
        return customer; // Return the customer associated with this invoice
    }

    // Setter method to update the associated customer
    public void setCustomer(Customer customer) {
        this.customer = customer; // Update the customer for this invoice
    }

    // Getter method to retrieve the invoice amount
    public double getAmount() {
        return amount; // Return the total amount of the invoice
    }

    // Setter method to update the invoice amount
    public void setAmount(double amount) {
        this.amount = amount; // Update the invoice amount
    }

    // Method to retrieve the name of the associated customer
    public String getCustomerName() {
        return customer.getName(); // Return the name of the customer
    }

    // Method to calculate the amount after applying the customer's discount
    public double getAmountAfterDiscount() {
        return amount - (amount * customer.getDiscount() / 100); // Calculate and return the discounted amount
    }
}
