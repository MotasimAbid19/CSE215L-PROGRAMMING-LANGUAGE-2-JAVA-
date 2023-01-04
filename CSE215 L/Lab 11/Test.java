import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //for a
        Cylinder[] c = new Cylinder[3];
        
        for (int i = 0; i < c.length; i++) {
            System.out.printf("Enter %d cylinder radius\n",i+1);
            double radius = input.nextDouble();
            System.out.printf("Enter %d cylinder hieght\n",i+1);
            double height = input.nextDouble();

            c[i]= new Cylinder(radius,height);
        }
        //for b
        
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i].toString());
        }

        //for c


        double totalHeight = 0 ;
        double totalRadius = 0 ;
        double totalArea = 0 ;
        double totalVolume = 0 ;
        System.out.println("no     height     radius     area     volume  ");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < c.length; i++) {

            System.out.printf("1      %.2f       %.2f       %.2f    %.2f \n",c[i].getHeight(),c[i].getRadius(),c[i].getArea(),c[i].getVolume());
            totalHeight = totalHeight + c[i].getHeight() ;
            totalRadius = totalRadius + c[i].getRadius() ;
            totalArea = totalArea + c[i].getArea() ;
            totalVolume = totalVolume + c[i].getVolume() ;
        }
        System.out.println("---------------------------------------------");
        System.out.printf("total %.2f       %.2f      %.2f   %.2f \n",totalHeight,totalRadius,totalArea,totalVolume);


       
    }

}
