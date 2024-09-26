package Task2.b;
import Task2.a.MyPoint;
public class TestMyTriangle {
    public static void main(String[] args){
        // Create two MyTriangle objects using parameterized constructer
        MyTriangle t1 = new MyTriangle(0, 0, 3, 0, 3, 4);
        MyTriangle t2 = new MyTriangle(new MyPoint(0, 0), new MyPoint(3, 0), new MyPoint(3, 4));
    
        // Perform Methods for Triangle 1
        System.out.println("\n"+ "Triangle 1:");
        System.out.println("Perimeter: " + t1.getPerimeter());
        System.out.println("Type: " + t1.printType());
        System.out.println("Triangle 1 to String: " + t1.toString());

        // Perform Methods for Triangle 2
        System.out.println("\nTriangle 2:");
        System.out.println("Perimeter: " + t2.getPerimeter());
        System.out.println("Type: " + t2.printType());
        System.out.println("Triangle 2 to String: " + t2.toString());
    }
}
