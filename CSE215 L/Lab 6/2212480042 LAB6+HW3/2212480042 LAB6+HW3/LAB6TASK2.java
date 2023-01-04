
import java.util.Scanner;



public class LAB6TASK2 {
    
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array = ");
        int size = input.nextInt();
        int[] array = new int[size];
        
        System.out.println("Enter the element of the array ");
        for (int i = 0; i < array.length; i++) {
            array[i]=input.nextInt();     
        }
        
        System.out.println("Enter the key = ");
        int key = input.nextInt();
        int x = findElement(array , key);
        if(x==1)
            System.out.println("the key value is present in that array");
        else
            System.out.println("the key value isnot present in that array");
        
    }

    public static int findElement(int[ ] arr, int key)
    {
        int x = 0 ;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==key){
                x=1 ;
            }
            
        }
        return x ;
    }
    
}
