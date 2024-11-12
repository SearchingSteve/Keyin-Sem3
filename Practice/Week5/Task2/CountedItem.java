package Practice.Week5.Task2;

// Subclass CountedItem
class CountedItem extends PurchaseItem {
    private int quantity; // quantity of items

    // Constructor
    public CountedItem(String name, double unitPrice, int quantity) {
        super(name, unitPrice);
        this.quantity = quantity;
    }

    // Getter and Setter for quantity
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    // Override getPrice to calculate price based on quantity
    @Override
    public double getPrice() {
        return getUnitPrice() * quantity;
    }

    // Override toString for formatted output
    @Override
    public String toString() {
        return super.toString() + " " + quantity + " units " + getPrice() + " SR";
    }
}