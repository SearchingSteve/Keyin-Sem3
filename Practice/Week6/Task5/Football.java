package Practice.Week6.Task5;

public class Football extends Ball {
    public Football(String brandName) {
        super(brandName);
    }

    @Override
    public void toss() {
        System.out.println("The football is tossed.");
    }

    @Override
    public void bounce() {
        System.out.println("The football bounces on the field!");
    }
}
