package lab3;

import java.util.Scanner;

public class LAB3TASK5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
        int temp = number;
        int r, sum = 0;
        while (temp > 0) {
            r = temp % 10;
            sum = (sum * 10) + r;
            temp = temp / 10;
        }
        if (sum == number) {
            System.out.println("It is a palindrome");

        } 
        else 
        {
            System.out.println("It is not a palindrome");
        }

    }

}
