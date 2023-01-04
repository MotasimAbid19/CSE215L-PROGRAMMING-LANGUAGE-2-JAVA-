import java.net.SocketTimeoutException;

public class Test {
    public static void main(String[] args) {
       Person p = new Person("Abid","Abid@gmail.com");
       Employee e = new Employee("Abir","Abir@gmail.com");
       Student s = new Student("Naima","Naima@gmail.com");
       Faculty f = new Faculty("Arif","Arif@gmail.com");
       Staff s1 = new Staff ("Najifa","Najifa@gmail.com");
       System.out.println(p);
       System.out.println(e);
       System.out.println(s);
       System.out.println(f);
       System.out.println(s1);
    }
    
}
