package Practice.Week5.Task1;

// Intermediate class Mammal
public class Mammal extends Animal {
    // Instance variable
    private String furColor;

    // Constructor
    public Mammal(String name, String furColor) {
        super(name);
        this.furColor = furColor;
    }

    // Getter for furColor
    public String getFurColor() {
        return furColor;
    }

    // Setter for furColor
    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    // Overridden toString method
    @Override
    public String toString() {
        return "Mammal[" + super.toString() + ", furColor=" + furColor + "]";
    }
}