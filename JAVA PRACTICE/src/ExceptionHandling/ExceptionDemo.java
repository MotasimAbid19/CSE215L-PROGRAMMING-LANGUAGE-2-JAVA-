public class ExceptionDemo {
    public static void main(String[] args) {
        int x= 10 ;
        int y = 0 ;
        try{
            int z = x/y ;
            System.out.println("Result = "+z);
        }
        catch(ArithmeticException e){
            System.out.println("Exception "+e);
        }
        System.out.println("Last line of the program");

    }
    
}
