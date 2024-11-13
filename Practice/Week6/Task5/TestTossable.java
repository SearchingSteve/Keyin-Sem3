package Practice.Week6.Task5;

public class TestTossable {
    public static void main(String[] args) {
        // Test Rock
        System.out.println("Testing Rock:");
        Tossable rock = new Rock();
        rock.toss();

        System.out.println("\nTesting Ball and its subclasses:");

        // Test Baseball
        Ball baseball = new Baseball("Wilson");
        System.out.println("Brand: " + baseball.getBrandName());
        baseball.toss();
        baseball.bounce();

        // Test Football
        Ball football = new Football("Nike");
        System.out.println("\nBrand: " + football.getBrandName());
        football.toss();
        football.bounce();

        System.out.println("\nTesting Polymorphism with Tossable Interface:");

        // Test polymorphism with Tossable
        Tossable tossableBaseball = new Baseball("Rawlings");
        tossableBaseball.toss();

        Tossable tossableFootball = new Football("Adidas");
        tossableFootball.toss();
    }
}
