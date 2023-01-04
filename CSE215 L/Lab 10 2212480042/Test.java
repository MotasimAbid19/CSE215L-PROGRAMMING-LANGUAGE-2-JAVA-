
public class Test {
    public static void main(String[] args) {
        Employee e1= new Employee(15,"ABID",20,5,"Bad programmer ", "IT");
        System.out.print("Basic salary = ");
        System.out.println(e1.getBasicSalary());
        System.out.print("Bonus salary = ");
        System.out.println(e1.getBonusSalary());
        
        Manager m1 = new Manager(32 ,"Shafin",20,5,"Good Programmer","IT");
        System.out.print("Basic salary = ");
        System.out.println(m1.getBasicSalary());
        System.out.print("Bonus salary = ");
        System.out.println(m1.getBonusSalary());
        
        
        
    }
    
}
