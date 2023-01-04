public class CircleTest {
    public static void printArea(Circle c, int n ){
       System.out.printf("The area of the %dth circle is %f\n",n, c.getArea());
        System.out.printf("The perimeter of the %dth circle is %f", n , c.getPerimeter());
       System.out.println();

    }
    public static void main(String[] args) {
    
        Circle c1 = new Circle() ;
        int radius = 7 ;
        c1.setRadius(radius);
        System.out.println("The area of the 1st circle is "+c1.getArea());
        System.out.println("The perimeter of the 1st circle is "+c1.getPerimeter());
        System.out.println();

        Circle c2

    }
    
}
