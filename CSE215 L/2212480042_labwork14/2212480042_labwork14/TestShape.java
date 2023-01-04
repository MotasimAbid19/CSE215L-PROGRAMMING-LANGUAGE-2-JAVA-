import java.util.Scanner;

public class TestShape {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("enter the value of base and height for triangle = ");
        double base = input.nextDouble();
        double height = input.nextDouble();
        Triangle t1 = new Triangle(base,height);
        System.out.println(t1.toString());
        System.out.println("enter the value of lenght and width for Rectangle = ");
        double lenght = input.nextDouble();
        double wight = input.nextDouble();
        Rectangle r1 = new Rectangle(lenght,wight);
        System.out.println(r1.toString());

    }
}
