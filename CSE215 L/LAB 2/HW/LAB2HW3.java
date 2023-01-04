import java.util.Scanner;
public class LAB2HW3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the minutes ");
        int min = input.nextInt();
        int year = min / (1*60*24*365) ;
        int remains = min % (1*60*24*365) ;
        int day = remains / (1*60*24);

        System.out.println("Year "+year);
        System.out.println("Day "+day);

        
    }
    
}
