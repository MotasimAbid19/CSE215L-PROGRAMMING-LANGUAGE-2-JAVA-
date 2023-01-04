
public class LAB5TASK1 {
    public static void printYearStatus(){
        int year = (int)(Math.random()*(2022-1995+1)+1995);
        System.out.println("The random year is "+year);
        
        if((year%400==0 || year % 4==0 ) && (year%100!=0))
        {
            System.out.println("It is a leap yaer");
        }
        else
        {
            System.out.println("it is not a leap year");
        }
        
    }
    public static void main(String[] args) {
        printYearStatus();
    }
    
}
