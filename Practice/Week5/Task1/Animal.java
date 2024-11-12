package Practice.Week5.Task1;

// Superclass Animal
public class Animal {
    private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    //  Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Overridden toString method
    @Override
    public String toString() {
        return "Animal[name=" + name + "]";
    }
}
