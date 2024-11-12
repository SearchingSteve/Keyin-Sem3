package Practice.Week5.Task1;

// Subclass Dog
public class Dog extends Mammal {
    private String breed;

    // Constructor
    public Dog(String name, String furColor, String breed) {
        super(name, furColor);
        this.breed = breed;
    }

    // Getter for breed
    public String getBreed() {
        return breed;
    }

    // Setter for breed
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Method to greet as specified in the diagram
    public void greets() {
        System.out.println("Woof");
    }

    // Overloaded method to greet another Dog
    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    // Overridden toString method
    @Override
    public String toString() {
        return "Dog[" + super.toString() + ", breed=" + breed + "]";
    }
}
