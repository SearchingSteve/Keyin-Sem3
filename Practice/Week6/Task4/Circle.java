package Practice.Week6.Task4;

// Circle.java
public class Circle implements GeometricObject {
    protected double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius;
    }
}
