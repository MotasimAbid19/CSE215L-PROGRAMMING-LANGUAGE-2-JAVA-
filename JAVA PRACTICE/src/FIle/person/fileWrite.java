
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Scanner;
import java.io.File;

public class fileWrite {
    public static void main(String[] args) throws Exception {
        String id, name;
        try {
            Formatter formatter = new Formatter("E:/JAVA/JAVA PRACTICE/src/FIle/person/student.txt");
            Scanner input = new Scanner(System.in);
            System.out.println("How many stds : ");

            int num = input.nextInt();

            for (int i = 1; i <= num; i++) {
                System.out.println("Enter ID ");
                id = input.next();
                System.out.println("Enter Name ");
                name = input.next();

                formatter.format("%s %s\r\n", id, name);
            }

            formatter.close();
            System.out.println("succusfully ran");

        } catch (Exception e) {
            System.out.println("Exception caught");
        }

        File file = new File("E:/JAVA/JAVA PRACTICE/src/FIle/person/teacher.txt");
        PrintWriter print = new PrintWriter(file);
        print.println(5);
        print.println("abid");
        print.close();

        System.out.println("done");

    }

}
