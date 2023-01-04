package lab3;

public class LAB3TASK1 {

    public static void main(String[] args) {
        int a = (int) (Math.random() * 10);
        System.out.println("1st Random is " + a);
        int b = (int) (Math.random() * 10);
        System.out.println("2nd Random is " + b);
        int c = (int) (Math.random() * 10);
        System.out.println("3rd Random is " + c);

        if (a < b) {
            if (a < c) {
                System.out.println(a + " is the smallest one");
            } else {
                System.out.println(c + " is the smallest one");
            }
        } else {
            if (b < c) {
                System.out.println(b + " is the smallest one");
            } else {
                System.out.println(c + " is the smallest one");
            }
        }
    }
}
