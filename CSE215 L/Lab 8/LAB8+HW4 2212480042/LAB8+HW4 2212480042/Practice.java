import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int optionNo;
        System.out.println("|---------------------------- |");
        System.out.println("| Dear,user select view method|");
        System.out.println("|-----------------------------|");
        System.out.println("|   Teacher? |  Student?      |");
        System.out.println("|    press 1 |   press 2      |");
        System.out.println("|---------------------------- |");

        optionNo = sc.nextInt();

        if (optionNo == 1) {
            Teacher();

        } else if (optionNo == 2) {
            Student();
        } else {
            System.out.println("\n" + "Invalid Choice." + "\n");
            Boolean flag = true;
            for (int i = 0; ((optionNo == 1 || optionNo == 2) != true); i++) {
                System.out.println("Dear user,you have pressed wrong key please press 1 or 2");
                optionNo = sc.nextInt();
                if (optionNo == 1) {
                    Teacher();
                } else if (optionNo == 2) {
                    Student();
                }

            }
        }

    }

    public static void Teacher() {
        Scanner sc = new Scanner(System.in);
    }

    public static void Student() {
        Scanner sc = new Scanner(System.in);
        String student1[] = new String[11];
        // String student2[]=new String[11];
        // String student3[][]=new String[1][11];
        System.out.println("coursenames:" + "\n" +
                "           1.CSE115" + "\n" +
                "           2.CSE215" + "\n" +
                "           3.CSE225");
        System.out.println("Section available" + "1  2 and 3 per course course:" + "\n");
        System.out.println("how many courses you want to take?");
        int a = sc.nextInt();
        System.out.println();
        System.out.println("Dear student,you can enter your name,student id, course and section one by one now:");
        for (int i = 0; i < ((a * 3) + 2); i++) {// starts from 0 runs till 7th index
            student1[i] = sc.nextLine();
        }

        for (int i = 0; i <=student1.length; i++) {// starts from 0 prints till 7th index
            {
                System.out.println(student1[i]);
            }
        }

    }
}