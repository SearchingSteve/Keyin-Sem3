package Practice.Week6.Task3;

public class MovableCircle implements Movable {
    // Instance variables
    private MovablePoint center;
    private int radius;

    // Constructor
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    // Abstract methods declared in the interface Movable
    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle with center at (" + center.x + ", " + center.y + ") and radius " + radius;
    }
}
