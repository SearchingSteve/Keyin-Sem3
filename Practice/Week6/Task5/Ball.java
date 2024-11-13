package Practice.Week6.Task5;

public abstract class Ball implements Tossable {
    private String brandName;

    public Ball(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void bounce() {
        System.out.println("The ball bounces!");
    }
}
