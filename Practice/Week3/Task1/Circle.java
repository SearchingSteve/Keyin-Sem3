package Practice.Week3.Task1;

public class Circle {
    // Constant value of PI for area calculations (using double for more precision)
    static double PI = 3.14f; // Consider using 3.14 instead of 3.14f for better precision

    // Instance variables for the Circle's radius and color
    private float radius = 1.0f; // Default radius set to 1.0
    private String color = "red"; // Default color set to red

    // Constructor to create a Circle with a specified radius
    public Circle(float radius) {
        this.radius = radius; // Assign the provided radius to the instance variable
    }

    // Constructor to create a Circle with a specified radius and color
    public Circle(float radius, String color) {
        this.radius = radius; // Assign the provided radius to the instance variable
        this.color = color; // Assign the provided color to the instance variable
    }

    // Getter method to retrieve the radius of the Circle
    public float getRadius() {
        return radius; // Return the current radius
    }

    // Setter method to update the radius of the Circle
    public void setRadius(float radius) {
        this.radius = radius; // Update the radius with the provided value
    }

    // Getter method to retrieve the color of the Circle
    public String getColor() {
        return color; // Return the current color
    }

    // Setter method to update the color of the Circle
    public void setColor(String color) {
        this.color = color; // Update the color with the provided value
    }

    // toString method to provide a string representation of the Circle object
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]"; // Return a formatted string with radius and color
    }

    // Method to calculate the area of the Circle
    public double getArea() {
        return PI * radius * radius; // Calculate and return the area using the formula πr²
    }
}
