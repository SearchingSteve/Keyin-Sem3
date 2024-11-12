package Practice.Week5.Task2;

// Test class to demonstrate functionality
public class TestPurchaseItems {
    public static void main(String[] args) {
        System.out.println("");
        // Test WeighedItem
        WeighedItem banana = new WeighedItem("Banana", 3.00, 1.37);
        System.out.println(banana.toString()); // Expected: Banana @ 3.0 1.37Kg 4.11 SR

        // Test CountedItem
        CountedItem pens = new CountedItem("Pens", 4.5, 10);
        System.out.println(pens.toString()); // Expected: Pens @ 4.5 10 units 45 SR
        System.out.println("");
    }
}
