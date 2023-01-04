import java.net.SocketTimeoutException;
import java.util.Scanner;

public class RoundWithSTL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input ");
        double xd = input.nextDouble();
        double mult = xd * 100.0;
        double add = mult + 0.5;
        int reuslts = (int) add;

        double result = reuslts / 100.0;

        System.out.println(result);// 2.13

        double x = 2.5;
        System.out.println(" "+Math.round(x));
        System.out.println("as "+Math.rint(x));
    }

}