public class RectangleTest {
    public static void main(String[] args) {
       Rectangle r1 = new Rectangle(4,40);
       Rectangle r2 = new Rectangle(3.5,35.9);

       System.out.println("The Width of the rectangle "+r1.printWidth());
       System.out.println("The heigth of the rectangle "+r1.printHeight());
       System.out.println("The area of the rectangle "+r1.getArea());
       System.out.println("The perimeter of the rectangle "+r1.getPerimeter());

       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println("The Width of the rectangle "+r2.printWidth());
       System.out.println("The heigth of the rectangle "+r2.printHeight());
       System.out.println("The area of the rectangle "+r2.getArea());
       System.out.println("The perimeter of the rectangle "+r2.getPerimeter());
       
       
    }
    
}
