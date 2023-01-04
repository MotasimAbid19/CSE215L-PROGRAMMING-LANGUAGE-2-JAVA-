import java.util.Scanner;



public class ExceptionProblemDemo {
    public static void main(String[] args) {
        while(true){
            try{
                Scanner input = new Scanner(System.in);
                System.out.println("PLease enter num1 = ");
                int num1 = input.nextInt();
                System.out.println("Please enter num2 ");
                int num2 = input.nextInt();
                int result = num1/num2 ;
                System.out.println("Result : "+num1+"/"+num2+" = "+result);

            }
            catch(Exception ex ){
                System.out.println("Exception "+ex);
                System.out.println("You must enter integer> Please try again");
            }
        }
    }
    
}
