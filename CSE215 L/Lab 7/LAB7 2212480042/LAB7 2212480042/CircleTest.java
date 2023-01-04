import java.util.Scanner; 
public class CircleTest{
    
    public static void main(String[] args) {
    
        //task 1 
        Circle c1 = new Circle() ;
        int radius = 7 ;
        c1.setRadius(radius);
        System.out.println("The area of the 1st circle is "+c1.getArea());
        System.out.println("The perimeter of the 1st circle is "+c1.getPerimeter());
        System.out.println();

        //task 2
        Circle c2= new Circle() ;
        
        printArea(c2, 2);
        c2.setRadius(3);
        printArea(c2, 2);
        Scanner input = new Scanner(System.in);
        Circle[] c = new Circle[3];

        //task 5
        for (int i = 0; i < c.length; i++) {
            System.out.println("Enter the radius");
            int r = input.nextInt();
            c[i] = new Circle(r);
            System.out.println(c[i].toString());
            
        }
        //intance count ;
        System.out.println(Circle.CircleCount()+" instances of circle class are created");
        
    }
    public static void printArea(Circle c, int n ){
        System.out.printf("The area of the %dth circle is %.3f\n",n, c.getArea());
        System.out.printf("The perimeter of the %dth circle is %.3f\n\n", n , c.getPerimeter());
        System.out.println();
    }
    
}
