import java.util.Scanner;

public class LAB2HW2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
         * while(1)
         * {
         * System.out.println("Enter a number between 1 to 1000 ");
         * int x ;
         * x = input.nextInt();
         * if(x<=1000)
         * {
         * break ;
         * }
         * }
         */
        System.out.println("Enter a number between 1 to 1000 ");
        int x;
        x = input.nextInt();
        int sum = 0, r;
        int temp = x;

        while (temp != 0) {

            r = temp % 10;

            sum = sum + r;

            temp = temp / 10;

        }
        System.out.println("Sum of the number " + sum);
    }

}
