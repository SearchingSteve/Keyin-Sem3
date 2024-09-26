package Task1;
public class TestCircle {
    public static void main(String[] args){
        // Create two Circle objects using parameterized constructer
        Circle c1 = new Circle(1.0f);
        Circle c2 = new Circle(5.0f, "blue");
    
        // Perform Methods for Circle 1
        System.out.println("Circle 1:");
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Color: " + c1.getColor());
        System.out.println("Area: " + c1.getArea());
        System.out.println("Circle 1 to String: " + c1.toString());

        // Perform Methods for Circle 2
        System.out.println("\nCircle 2:");
        System.out.println("Radius: " + c2.getRadius());
        System.out.println("Color: " + c2.getColor());
        System.out.println("Area: " + c2.getArea());
        System.out.println("Circle 2 to String: " + c2.toString());
        

    }
}
