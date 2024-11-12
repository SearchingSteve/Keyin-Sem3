package Practice.Week6.Task1;

public class TestShape {
    public static void main(String[] args) {
        System.out.println("");

        // Test Circle
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); // Circle's toString
        System.out.println(s1.getArea()); // Circle's getArea
        System.out.println(s1.getPerimeter()); // Circle's getPerimeter
        System.out.println(s1.getColor()); // Shape's getColor
        System.out.println(s1.isFilled()); // Shape's isFilled

        Circle c1 = (Circle) s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        // Test Rectangle
        Shape s3 = new Rectangle(1.0, 2.0, "BLUE", true); // Upcast
        System.out.println(s3); // Rectangle's toString
        System.out.println(s3.getArea()); // Rectangle's getArea
        System.out.println(s3.getPerimeter()); // Rectangle's getPerimeter
        System.out.println(s3.getColor()); // Shape's getColor

        Rectangle r1 = (Rectangle) s3; // Downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        // Test Square
        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4); // Square's toString
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());

        Rectangle r2 = (Rectangle) s4; // Upcast to Rectangle
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());

        Square sq1 = (Square) r2; // Downcast to Square
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println("");
    }
}
