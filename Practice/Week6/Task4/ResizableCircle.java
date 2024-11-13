package Practice.Week6.Task4;

// ResizableCircle class extends Circle class and implements Resizable interface
public class ResizableCircle extends Circle implements Resizable {

    // Constructor
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius *= (1 + percent / 100.0);
    }

    @Override
    public String toString() {
        return "ResizableCircle with radius " + radius;
    }
}

