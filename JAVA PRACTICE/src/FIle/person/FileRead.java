

import java.util.ArrayList;


import java.util.Scanner;
import java.io.File; ;

public class FileRead {
    public static void main(String[] args) {
        ArrayList<String> nameUser = new ArrayList<String>();
        try {
            
            File file = new File("E:/JAVA/JAVA PRACTICE/src/FIle/person/student.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
               // String id = scanner.next();
                String name = scanner.next();
               // System.out.println("ID "+id+" Name "+name);
               nameUser.add(name);
            }



            
            
        } catch (Exception e) {
            System.out.println(e);
        }

        

    }
    
}
