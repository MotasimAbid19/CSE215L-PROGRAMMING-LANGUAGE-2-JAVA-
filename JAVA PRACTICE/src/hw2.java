public class hw2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 5 ;
         while(a > 4)
        {
            System.out.println("Enter a number between 1 to 1000 ");
            int x ;
            x = input.nextInt();
            if(x<=1000)
            {
                break ;
            }
        } 
        
        int sum = 0  , r ;
        int temp = x ;
        
        while (temp != 0) {

            r =temp%10 ;
            
            sum=sum+ r ;
            
            temp = temp / 10 ;

        }
        System.out.println("Sum of the number "+sum);
    }

    
}
