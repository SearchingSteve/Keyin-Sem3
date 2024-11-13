package Practice.Week6.Task5;

public class Baseball extends Ball {
    public Baseball(String brandName) {
        super(brandName);
    }

    @Override
    public void toss() {
        System.out.println("The baseball is tossed.");
    }

    @Override
    public void bounce() {
        System.out.println("The baseball bounces on the ground!");
    }
}

