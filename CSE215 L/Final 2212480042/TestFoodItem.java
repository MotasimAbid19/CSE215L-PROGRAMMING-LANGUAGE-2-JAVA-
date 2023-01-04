import java.util.Scanner ;
public class TestFoodItem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter food name for 1st instance = ");
        String foodname1 = input.nextLine();
        System.out.println("Enter the value of the food for 1st instance = ");
        double value1 = input.nextDouble() ;
        FoodItem f1 = new FoodItem(foodname1 , value1);
        FoodItem f2 = new FoodItem();
        String garbage = input.nextLine();
        System.out.println("Enter food name for 2nd instance = ");
        String foodname2 = input.nextLine();
        System.out.println("Enter the value of the food for 2nd instance = ");
        double value2 = input.nextDouble() ;
        f2.setName(foodname2);
        f2.setPrice(value2);        
        
        System.out.println("How many instances you created?Answer= "+FoodItem.getNoOfItems());
        
        printFoodItem(f1);
        printFoodItem(f2);
        
        
        
    }
    public static void printFoodItem(FoodItem f){
        System.out.print("FoodItem : Name "+f.getName());
        System.out.println(f.getPrice()+" costs price BDT only");
        
    }
    
}
