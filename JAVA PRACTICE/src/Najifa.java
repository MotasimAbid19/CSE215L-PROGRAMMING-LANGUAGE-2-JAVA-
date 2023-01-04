import java.util.Scanner;

public class Najifa {
    public static int countUpperCaseLetters(String s1) {
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z') {
                count++;
            }
        }

        return count;
    }

    public static int countLowerCaseLetters(String s2) {
        int count = 0;
        for (int i = 0; i < s2.length(); i++) {

            if (s2.charAt(i) >= 'a' && s2.charAt(i) <= 'z') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String str = i.nextLine();
        System.out.println(str);

        int upper = countUpperCaseLetters(str);
        int lower = countLowerCaseLetters(str);

        System.out.println("Count of upper case letters are: " + upper);
        System.out.println("Count of lower case letters are: " + lower);
    }

}
