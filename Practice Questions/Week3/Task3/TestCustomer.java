package Task3;

public class TestCustomer {
    public static void main(String[] args) {
        // Test Customer Creation and Discount Modification
        Customer c1 = new Customer(1, "John", 10); // Create a customer with ID 1, name "John", and a 10% discount.
        System.out.println(c1); // Print customer details.
        
        // Test updating the discount
        c1.setDiscount(20); // Change discount to 20%.
        System.out.println("Updated " + c1); // Print updated customer details.

        // Test Account Creation and Methods
        Account a1 = new Account(1, c1, 100); // Create an account for customer "John" with an initial balance of 100.
        System.out.println("Account 1: " + a1); // Print account details.
        
        // Test deposit method
        a1.deposit(50); // Deposit 50 to the account.
        System.out.println("Account 1 amount after deposit: " + a1); // Print account details after deposit.
        
        // Test withdraw method
        a1.withdraw(50); // Withdraw 50 from the account.
        System.out.println("Account 1 amount after withdrawal: " + a1); // Print account details after withdrawal.

        // Test withdrawing more than the balance
        a1.withdraw(200); // Attempt to withdraw more than the current balance.
        
        // Create another customer and perform similar tests
        Customer c2 = new Customer(2, "Jane", 20); // Create a second customer with ID 2, name "Jane", and a 20% discount.
        System.out.println(c2); // Print customer details.
        
        // Test updating the discount for the second customer
        c2.setDiscount(30); // Change discount to 30%.
        System.out.println("Updated " + c2); // Print updated customer details.

        // Test account creation for the second customer
        Account a2 = new Account(2, c2, 200); // Create an account for customer "Jane" with an initial balance of 200.
        System.out.println("Account 2: " + a2); // Print account details.
        
        // Test deposit method for the second account
        a2.deposit(100); // Deposit 100 to the account.
        System.out.println("Account 2 amount after deposit: " + a2); // Print account details after deposit.
        
        // Test withdraw method for the second account
        a2.withdraw(100); // Withdraw 100 from the account.
        System.out.println("Account 2 amount after withdrawal: " + a2); // Print account details after withdrawal.

        // Test withdrawing more than the balance for the second account
        a2.withdraw(300); // Attempt to withdraw more than the current balance.
    }
}
