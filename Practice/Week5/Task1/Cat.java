package Practice.Week5.Task1;

// Subclass Cat
public class Cat extends Mammal {
    // Instance variable
    private boolean isIndoor;

    // Constructor
    public Cat(String name, String furColor, boolean isIndoor) {
        super(name, furColor);
        this.isIndoor = isIndoor;
    }

    // Getter for isIndoor
    public boolean isIndoor() {
        return isIndoor;
    }

    // Setter for isIndoor
    public void setIndoor(boolean isIndoor) {
        this.isIndoor = isIndoor;
    }

    // Method to greet as specified in the diagram
    public void greets() {
        System.out.println("Meow");
    }

    // Overridden toString method
    @Override
    public String toString() {
        return "Cat[" + super.toString() + ", isIndoor=" + isIndoor + "]";
    }
}
