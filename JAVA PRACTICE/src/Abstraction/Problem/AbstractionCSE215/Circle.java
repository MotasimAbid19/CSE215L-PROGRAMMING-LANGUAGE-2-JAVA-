

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(String colour, boolean filler, double radius) {
        super(colour, filler);
        this.radius = radius;
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

    public double getDiameter() {
        return 2 * this.radius;
    }

    public double getArea() {
        return 3.1416 * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * 3.1416 * this.radius;
    }

}
