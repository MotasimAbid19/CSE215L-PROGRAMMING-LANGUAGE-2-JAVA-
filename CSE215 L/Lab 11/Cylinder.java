
public class Cylinder extends Circle {
    private double height;

    Cylinder() {
        height = 1;
    }

    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (2 * 3.1416 * super.getRadius() * this.height) + (2 * super.getArea());
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cyclinder Height = " + this.height + " Radius =" + super.getRadius() + "  Area =" + this.getArea()
                + " Volume =" + this.getVolume();
    }

}
