import java.util.Scanner;
public class LAB4TASK2 {
    public static double arearOfPentagon(double side) {
        int n = 5 ;
        
        double area = (n*side*side)/(4*Math.tan((Math.PI/n)));
        return area ;
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Side of pentagon");
        double side = input.nextDouble();
        
        double area = arearOfPentagon( side);
        System.out.printf("The area of the pentagon is %.3f", area);
        
    }
    
}
