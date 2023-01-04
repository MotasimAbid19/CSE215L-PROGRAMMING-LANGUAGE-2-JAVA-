public class Staff extends Employee{
    String title ;
    public Staff(){
        title ="Senior Executive";

    }
    public Staff(String name ,String email){
        super(name,email );
    }
    public String toString(){
        return "Staff Class :"+"Person name ="+name+" Email = "+email ; 
    }


    
}
