

import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        try {
            File file = new File("E:/JAVA/JAVA PRACTICE/src/FIle/person/student.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                String id = scanner.next();
                String name = scanner.next();
                System.out.println("ID "+id+" Name "+name);


            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
}
