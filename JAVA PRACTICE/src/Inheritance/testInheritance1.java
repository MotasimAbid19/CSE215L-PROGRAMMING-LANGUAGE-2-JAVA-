import java.net.SocketTimeoutException;
import java.util.Scanner;
public class testInheritance1 {
    public static void main(String[] args) {
        teacherInheritance t1 = new teacherInheritance();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name ");
        t1.name = input.nextLine();
        System.out.println("Enter the age ");
        t1.age= input.nextInt();
        
        System.out.println("Enter the qualification ");
        String str = input.nextLine();
        t1.qualification = str;

        t1.displayInformation2();

        teacherInheritance t2 = new teacherInheritance();
        
        System.out.println("Enter the name ");
        t2.name = input.nextLine();
        System.out.println("Enter the age ");
        t2.age= input.nextInt();
        System.out.println("Enter the qualification ");
        t2.qualification = input.nextLine();

        t2.displayInformation2();
    }
    
}
