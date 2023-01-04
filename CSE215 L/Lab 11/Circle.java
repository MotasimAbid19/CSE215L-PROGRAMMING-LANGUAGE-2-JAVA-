
public class Circle {
    private double radius;

    public Circle() {
        radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.1416 * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "Circle Radius =" + this.getRadius() + " Circle Area =" + this.getArea();
    }

}
