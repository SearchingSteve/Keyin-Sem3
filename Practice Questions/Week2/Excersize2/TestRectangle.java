package Excersize2;
public class TestRectangle {
    public static void main(String[] args) {
        // Create two Rectangle objects using the parameterized constructor
        Rectangle r1 = new Rectangle(1.0f, 10.0f);
        Rectangle r2 = new Rectangle(5.0f, 7.5f);

        // Perform Methods for Rectangle 1
        System.out.println("Rectangle 1:");
        System.out.println("Length: " + r1.getLength());
        System.out.println("Width: " + r1.getWidth());
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        // Perform Methods for Rectangle 2
        System.out.println("\nRectangle 2:");
        System.out.println("Length: " + r2.getLength());
        System.out.println("Width: " + r2.getWidth());
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());
    }
}
