
import java.util.Scanner;

public class LAB5TASK5 {

    public static int countLowercaseLetters(String s1) {
        int count = 0 ;

        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)>='a' && s1.charAt(i)<='z'){
                count++;
            }
            
        }
        return count ;
    }

    public static int countUpppercaseLetters(String s2) {

        int count = 0;
        for (int i = 0; i < s2.length(); i++) {
            if(s2.charAt(i)>='A' && s2.charAt(i)<='Z'){
                count++;
            }
            
        }
        
        return count ;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a string: ");
        String s = input.nextLine() ;
        
        int lower =  countLowercaseLetters( s);
        int upper =  countUpppercaseLetters( s);
        System.out.println("The number of uppercase in string is "+upper);
        System.out.println("The number of lowercase in string is "+lower);
   

    }

}
