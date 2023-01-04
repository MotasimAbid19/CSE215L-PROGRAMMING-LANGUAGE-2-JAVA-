import java.util.ArrayList;


import java.util.Scanner;
import java.io.File; ;
public class demo2 {
    public static void main(String[] args) {
        ArrayList<String> nameUser = new ArrayList<String>();
        try {
            
            File file = new File("E:/JAVA/JAVA PRACTICE/src/FIle/person/student.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
               // String id = scanner.next();
                String name = scanner.next()+" "+scanner.next();
               // System.out.println("ID "+id+" Name "+name);
               nameUser.add(name);
            }
            for (String x : nameUser) {
                System.out.println(x);
                
            }

            if(nameUser.contains("abid najifa"))
            {
                System.out.println("Its contains");
            }   
            
        } catch (Exception e) {
            System.out.println(e);
        }

        
    }
    
}
