import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Formatter;
import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("E:/JAVA/JAVA PRACTICE/src/FIle/person/student.txt",true);
        BufferedWriter b = new BufferedWriter(file);
        Scanner sc= new Scanner(System.in);
        System.out.println("asda");
        String name = sc.nextLine();
        String id = sc.nextLine();
        String str = name+" "+id+"\n";

        b.write(str);
        b.close();
        file.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }


        
        
    }

    
}
