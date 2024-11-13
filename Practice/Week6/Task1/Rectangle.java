package Practice.Week6.Task1;

class Rectangle extends Shape {
    // Protected fields accessible within the same package and subclasses
    protected double width;
    protected double length;

    // Constructors
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    // Constructor with width and length
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Constructor with width, length, color and filled
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getters and Setters
    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }

    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ", width=" + width + ", length=" + length + "]";
    }
}
