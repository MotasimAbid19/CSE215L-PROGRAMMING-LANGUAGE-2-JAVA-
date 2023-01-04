//1. Write a program that prompts the user to input integer elements in an array of size n. 
//Then display the number of elements (normally and with percentage) greater than the average.
import java.util.Scanner ;
public class LAB6TASK1 {
    public static void main(String[] args) {
        Scanner input = new Scanner  (System.in);
        int size ;
        System.out.println("Enter the size of an array ");
        size = input.nextInt() ;
        int[] arr = new int[size];
        int sum = 0 ;
        System.out.println("Enter the element = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
            sum += arr[i];
        }
        int avg = sum / size ;
        // normally values which are greater than average
        System.out.println("Enter the element which is greater than avaerage = "); 
        int sum2 = 0 ;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>avg)
            {
                sum2+=arr[i];
                System.out.println(arr[i]+" ");
            }
        }
        System.out.println(sum );
        System.out.println(sum2);

        // for percentage
        double p =(double) sum2 / sum ;
        double percentage = p * 100 ;
        System.out.println("the percentage is "+ percentage);
        
    }
    
}
