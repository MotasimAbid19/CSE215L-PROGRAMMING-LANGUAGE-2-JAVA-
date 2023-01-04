/*Suppose, an array has n values? Write a method that finds the median
of those values*/

import java.util.Arrays;

public class middleOfArray {

    public static int medianValue(int[] arr ){
        int n = arr.length / 2 ;
        return n ;
    }
    public static void main(String[] args) {
        

        int[] array = new int[10];
        array[0]= 5 ;
        array[1]=6 ;
        array[2]= 4;
        array[3]= 2;
        array[4]= 3;
        array[5]=1 ;
        array[6]= 0;
        array[7]= 7;
        array[8]= 8;
        array[9]= 9;

        Arrays.sort(array);

        int median = medianValue(array);
        

        System.out.println("The median value is "+array[median]);
        

    }
    
}
