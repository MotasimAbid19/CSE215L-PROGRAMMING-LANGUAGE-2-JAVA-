import java.util.Scanner;
public class Palimdrome {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        System.out.println("Enter the number you want to reverse : ");
        int x = input.nextInt();
        int rem ,sum=0 , temp ;
        temp = x ;

        while (temp!=0)
        {
            rem = temp % 10 ;
            sum = sum * 10 + rem ;
            temp = temp /10;
        }
        if (sum == x)
        {
            System.out.println("its a palindrome number");

        }
        else
        {
            System.out.println("Ïts not a plaindorme number");
            
        }

        


        
    }
    
}
