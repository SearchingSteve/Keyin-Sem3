package Practice.Week5.Task2;

// Superclass PurchaseItem
public class PurchaseItem {
    private String name;
    private double unitPrice;

    // Default Constructor
    public PurchaseItem() {
        this.name = "no item";
        this.unitPrice = 0.0;
    }

    // Parameterized Constructor
    public PurchaseItem(String name, double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }

    // Getters
    public String getName() { return name; }
    public double getUnitPrice() { return unitPrice; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }

    // Method to get the price (returns unit price by default, overridden in subclasses)
    public double getPrice() {
        return unitPrice;
    }

    // toString method
    @Override
    public String toString() {
        return name + " @ " + unitPrice;
    }
}


