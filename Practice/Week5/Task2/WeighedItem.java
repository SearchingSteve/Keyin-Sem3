package Practice.Week5.Task2;

// Subclass WeighedItem
class WeighedItem extends PurchaseItem {
    private double weight; // weight in Kg

    // Constructor
    public WeighedItem(String name, double unitPrice, double weight) {
        super(name, unitPrice);
        this.weight = weight;
    }

    // Getter and Setter for weight
    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    // Override getPrice to calculate price based on weight
    @Override
    public double getPrice() {
        return getUnitPrice() * weight;
    }

    // Override toString for formatted output
    @Override
    public String toString() {
        return super.toString() + " " + weight + "Kg " + getPrice() + " SR";
    }
}
