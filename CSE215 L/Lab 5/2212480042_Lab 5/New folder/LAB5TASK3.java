import java.util.Scanner ;
public class LAB5TASK3 {
    public static boolean isPrime(int a){
        boolean flag = false ;
        for (int i = 2; i < a ; i++) {
            if(a%i==0){
                flag=true;
                break;
            }
            
        }
        
        return flag ;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number ");
        int number = input.nextInt();
        
        boolean x = isPrime(number);
        
       
        if(x==true)
        {
            System.out.println("It is not a prime");
        }
        else
        {
            System.out.println("It is a prime");
        }
        
    }
    
}
