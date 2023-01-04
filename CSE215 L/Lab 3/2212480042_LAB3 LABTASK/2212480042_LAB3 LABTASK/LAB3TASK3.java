package lab3;

import java.util.Scanner;

public class LAB3TASK3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = input.nextInt();
        int flag = 0;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }

        }
        if (flag > 0) {
            System.out.println("It is not prime");
        } else {
            System.out.println("It is prime");
        }
    }

}
