package Practice.Week6.Task4;

// TestResizableCircle.java
public class TestResizableCircle {
    public static void main(String[] args) {
        System.out.println(":");
        ResizableCircle resizableCircle = new ResizableCircle(5.0);
        System.out.println("Testing ResizableCircle:");
        System.out.println(resizableCircle);
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());
        System.out.println("Area: " + resizableCircle.getArea());

        System.out.println("\nResizing the circle by 50%...");
        resizableCircle.resize(50); // Increase radius by 50%
        System.out.println("After resizing:");
        System.out.println(resizableCircle);
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());
        System.out.println("Area: " + resizableCircle.getArea());
        System.out.println("");
    }
}
