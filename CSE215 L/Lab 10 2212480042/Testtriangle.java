import java.net.SocketTimeoutException;
import java.util.Scanner ;
public class Testtriangle {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Triangle[] t = new Triangle[2];
    for (int i = 0; i < t.length; i++) {
        
        System.out.println("Enter the value of 3 sides of  the triangle = ");
        int s1 = input.nextInt();
        int s2 = input.nextInt();
        int s3 = input.nextInt();
        t[i]= new Triangle(s1,s2,s3) ;
        

        printTriangleInfo(t[i]);
    }

   }
  public static void printTriangleInfo(Triangle t)
   {
      System.out.println("The three sides of the Triangle is = ");
      System.out.println("1st side ="+t.getS1());
      System.out.println("2nd side ="+t.getS2());
      System.out.println("3rd side ="+t.getS3());
      System.out.println("Area of the triangle = "+t.getArea());
      System.out.println("Perimerter of the triangle ="+t.getPerimeter());


   }

}
