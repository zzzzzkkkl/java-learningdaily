package homework.day15.question1;

public class Round implements Shape{
    private double radius;
    private final double PI=3.14159;

    public Round() {
    }

    public Round(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    @Override
    public double area() {
        return PI*radius*radius;
    }

    @Override
    public double allLength() {
        return 2*PI*radius;
    }
}
