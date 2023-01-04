public class Person {
    public String name  ;
    String address ;
     String phonenumber ;
     String email ;
    Person(){

    }
    Person(String name , String email){
        this.name = name  ;
        this.email = email ;
    }
    public String toString (){
        return "Person Class :"+"Person name ="+name+" Email = "+email ;
    }
}
