public class Faculty extends Employee {
    int officeHours ;
    String rank ;
    public Faculty(){
        rank = "Senior"; 
    }
    public Faculty (String name, String email){
        super(name, email);

    }
    public String toString()
    {
        return "Faculty Class :"+"Person name ="+name+" Email = "+email ; 
    }

    
}
