package Practice.Week6.Task1;

class Circle extends Shape {
    // Instance variables
    private double radius;

    // Constructors
    public Circle() {
        this.radius = 1.0;
    }

    // Constructor with radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Constructor with radius, color and filled
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter and Setter for radius
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    // Overridden getArea and getPerimeter methods
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Overridden toString method
    @Override
    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }
}
