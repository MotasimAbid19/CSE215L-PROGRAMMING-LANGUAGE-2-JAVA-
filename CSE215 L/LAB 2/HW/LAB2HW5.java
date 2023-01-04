import java.util.Scanner;

public class LAB2HW5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double s, side1, side2, side3;
        System.out.println("Enter the value of side 1 ");
        side1 = input.nextDouble();
        System.out.println("Enter the value of side 2 ");
        side2 = input.nextDouble();
        System.out.println("Enter the value of side 3 ");
        side3 = input.nextDouble();
        s = (side1 + side2 + side3) / 2;

        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.printf("The area of a triangle is %.3f", area);
    }

}
