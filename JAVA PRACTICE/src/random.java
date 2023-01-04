/*Generate 100 lowercase
letters randomly and assign to
an array of characters*/
//Count the occurrence of each
//letter in the array.
public class random {

    public static void main(String[] args) {
        final int size = 100;
        char[] charray = new char[100];

        for (int i = 0; i < charray.length; i++) {
            charray[i] = (char) ('a' + Math.random() * ('z' - 'a' + 1));
            System.out.print(charray[i] + " ");

        }
        // for each er diye
        /*
         * for (char c : charray) {
         * System.out.println(c);
         * }
         */

        for (char i = 'a'; i <= 'z'; i++) {
            int count =0;
            for (int j = 0; j < charray.length; j++) {
                if(i==charray[j])
                count++ ;
            }
            System.out.println("  "+i+" ="+count);
            
        }

    }
}
