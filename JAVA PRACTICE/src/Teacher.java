public class Teacher {
    String name , gender ;
    int phone ;
    void setInfo(String n , String g , int p )
    {
        name = n ;
        gender = g ;
        phone = p;

    }
    /* Construct name should be same as class
    Teacher(String n , String g , int n)
    {
        n=name ;
        g= gender ;
        n = phone ;
    }
    */
    
    void TeacherInfo(){
        System.out.println();
        System.out.println();
        System.out.println("Name "+name);
        System.out.println("gender "+gender);
        System.out.println("PHone "+phone); 
    }
}
