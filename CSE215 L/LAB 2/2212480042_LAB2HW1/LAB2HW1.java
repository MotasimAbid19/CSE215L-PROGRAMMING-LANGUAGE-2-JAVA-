import java.util.Scanner;
public class LAB2HW1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of a cylinder ");
        double radius = input.nextDouble();
        System.out.println("Enter the length of a cylinder ");
        double length = input.nextDouble();

        double area = radius * radius * Math.PI ;
        double volume = area * length ; 

        System.out.printf("The area of the cylinder is %.3f\n", area);
        System.out.printf("The volume of the cylinder is %.3f\n", volume);


    }

    
}