package Excersize4;
public class TestInvoice {

public static void main(String[] args) {
        
    Invoice invoice1 = new Invoice("1", "Paper", 1, 1);
    Invoice invoice2 = new Invoice("2", "Pencil", 5, 2);
    Invoice invoice3 = new Invoice("3", "Eraser", 10, 3.5);
    Invoice invoice4 = new Invoice("4", "Marker", 100, 4);

    // Create a copy of invoice1 using the copy constructor
    Invoice invoiceCopy = new Invoice(invoice1);

    

    // Print invoice details
    System.out.println(invoice1.toString());
    System.out.println("\n" +"Total for invoice1: $" + invoice1.getTotal());

    System.out.println(invoice2.toString());
    System.out.println("Total for invoice2: $" + invoice2.getTotal());

    System.out.println(invoice3.toString());
    System.out.println("Total for invoice3 : $" + invoice3.getTotal());

    System.out.println(invoice4.toString());
    System.out.println("Total for invoice4: $" + invoice4.getTotal() +"\n");

    // Test Setters:
    invoice1.setQty(20);  // Change Paper quantity to 20  
    invoice2.setUnitPrice(1.5);  // Change Keyboard price to 1.5

    // Print invoice details after using setters
    System.out.println(invoice1.toString());
    System.out.println("Total for invoice1: $" + invoice1.getTotal());
    System.out.println(invoice2.toString());
    System.out.println("Total for invoice2: $" + invoice2.getTotal() +"\n");


    // Print copied invoice details
    System.out.println(invoiceCopy.toString());
    System.out.println("Total for copied invoice (invoiceCopy): $" + invoiceCopy.getTotal() +"\n");

    // Print the total number of invoices created
    System.out.println("Total number of invoices created: " + Invoice.getInvoiceCount());
}
}