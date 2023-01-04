import java.util.Date;
public class Employee extends Person {
    String office ; 
    double salary ; 
    Date dateHired ;
    public Employee(){

        office = "morning ";
        

        }
    public Employee(String name,String email){
        super(name,email);
    }
    public String toString(){
        return "Employee :"+"Person name ="+name+" Email = "+email ; 
    }
}
