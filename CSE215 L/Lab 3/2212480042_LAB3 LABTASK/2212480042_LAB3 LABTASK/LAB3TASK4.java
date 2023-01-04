package lab3;

import java.util.Scanner;

public class LAB3TASK4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ; ");
        int n = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", i, n, (i * n));

        }
    }

}
