package Practice.Week6.Task4;

// Test Circle class
public class TestCircle {
    public static void main(String[] args) {
        System.out.println("");
        Circle circle = new Circle(5.0);
        System.out.println("Testing Circle:");
        System.out.println(circle);
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());
        System.out.println("");

    }
}
