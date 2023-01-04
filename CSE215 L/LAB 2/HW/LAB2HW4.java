import java.util.Scanner;

public class LAB2HW4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of a hexagon ");

        int side = input.nextInt();
        double area = ((3 * Math.sqrt(3)) / 2) * side * side;
        System.out.printf("Area of a hexagon %.3f", area);
    }
}
