

public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject geoOb1 = new Circle(5);
        GeometricObject geoOb2 = new Rectangle(5, 3);

        System.out.println("The two objects have the same area?" + equalArea(geoOb1, geoOb2));

        displayGeoObj(geoOb1);
        displayGeoObj(geoOb2);

    }

    public static boolean equalArea(GeometricObject ob1, GeometricObject ob2) {
        return ob1.getArea() ==ob2.getArea();
    }

    public static void displayGeoObj(GeometricObject ob1) {
        System.out.println();
        System.out.println("The area is " + ob1.getArea());
        System.out.println("The perimeter is " + ob1.getPerimeter());

    }

}
