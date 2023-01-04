import java.util.Scanner ;
public class TestFOrTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //for Car
        System.out.println("Enter the customer Name  ");
        String name1 = input.nextLine();
        System.out.println(" enter the year of the model  ");
        int year1 = input.nextInt() ;
        System.out.println("Enter the total hours ");
        double hour1 = input.nextInt() ;
        Car c1= new Car(name1, year1 , hour1) ;
        String garbage = input.nextLine();
        
         System.out.println("Enter the customer Name  ");
        String name2 = input.nextLine();
        System.out.println(" enter the year of the model  ");
        int year2 = input.nextInt() ;
        System.out.println("Enter the total hours ");
        double hour2 = input.nextInt() ;
        Car c2 = new Car(name2, year2 , hour2) ;
        
        
        
         String garbage2 = input.nextLine();
        
         System.out.println("Enter the customer Name  ");
        String name3 = input.nextLine();
        System.out.println(" enter the weoght capacity  ");
        double weight3 = input.nextInt() ;
        System.out.println("Enter the total hours ");
        double hour3 = input.nextInt() ;
        Van v1 = new Van(name3, weight3 , hour3) ;
        
        
        String garbage3 = input.nextLine();
        
         System.out.println("Enter the customer Name  ");
        String name4 = input.nextLine();
        System.out.println(" enter the weoght capacity  ");
        double weight4 = input.nextInt() ;
        System.out.println("Enter the total hours ");
        double hour4 = input.nextInt() ;
        Van v2 = new Van(name4, weight4 , hour4) ;
        
        
        printCar(c1);
        printCar(c2);
        printVan(v1);
        printVan(v2);
        
        
        
        
    }
    
    public static void printCar(Car c){
        System.out.println();
        System.out.println("Status "+c.toString());
        System.out.println("The amount of the total fees "+c.getTotalAmounts());
        System.out.println("The advance booking fees for each instance "+c.getAdvanceAmounts());
    }
    
    public static void printVan(Van c){
        System.out.println();
        System.out.println("Status "+c.toString());
        System.out.println("The amount of the total fees "+c.getTotalAmounts());
        System.out.println("The advance booking fees for each instance "+c.getAdvanceAmounts());
    }
    
}
