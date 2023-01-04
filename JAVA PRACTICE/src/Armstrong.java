import java.util.*;
import java.lang.Math;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
        int rem , sum = 0 , temp  ; 
        temp = number ;

        while ( temp != 0 )
        {
            rem = temp %10 ; 
            sum = sum + rem * rem * rem ;
            temp = temp /10 ;
        }

        System.out.println(sum);


        if(sum == number)
        {
            System.out.println("Its a armstrong number");
        }
        else
        {
            System.out.println("Its not a armstrong number");
        }


    }
    
}
