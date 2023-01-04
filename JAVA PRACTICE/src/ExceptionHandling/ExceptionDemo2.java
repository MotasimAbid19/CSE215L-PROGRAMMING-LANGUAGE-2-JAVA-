public class ExceptionDemo2 {
    public static void main(String[] args) {
        int x= 10 ;
        int y = 0 ;
        try{
            int z = x/y ;
            System.out.println("Result = "+z);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception "+e);
        }
        finally{
            System.out.println("Last line of the program");
        }
       
    }
    
}
