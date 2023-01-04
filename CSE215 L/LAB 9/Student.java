public class Student extends Person {
    final String status ;
    Student(){
        status ="freshman";
    }
    Student(String name, String email){
        super(name,email);
        status = "junior";
    }
    @Override
    public String toString(){

        return "Student Class :"+"Person name ="+name+" Email = "+email ; 
    }
    
}
