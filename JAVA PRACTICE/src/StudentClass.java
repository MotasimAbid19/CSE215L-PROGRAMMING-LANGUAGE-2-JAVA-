import java.net.SocketTimeoutException;

public class StudentClass {
    String name ;
    int id ;
    static String university = "NSU" ;

    StudentClass(String n ,  int i){
        name = n ;
        id = i ;
    }

    void printStudentInfo(){
        System.out.println();
        System.out.println("Name ="+name);
        System.out.println("Id ="+id);
        System.out.println("University Name ="+university);
        System.out.println();
        System.out.println();
    }
    
}
