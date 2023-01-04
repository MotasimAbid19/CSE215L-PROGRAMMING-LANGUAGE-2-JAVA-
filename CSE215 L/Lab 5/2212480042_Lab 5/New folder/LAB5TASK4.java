
import java.util.Scanner;

public class LAB5TASK4 {

    public static int findGCD(int a, int b) {
        int gcd = 1;

        for (int i = 1; i <= a && i <= b; i++) {

            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 number ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int x = findGCD(number1 , number2);
        
        System.out.println("GCD ="+x);
    


    }
    
}
