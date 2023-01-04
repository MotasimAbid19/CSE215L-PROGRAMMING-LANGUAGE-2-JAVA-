import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size = input.nextInt();
        double[] array = new double[size];

        double sum = 0;
        System.out.println("Enter the element ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
            sum = sum + array[i];
        }
        System.out.println("the sum of the array is " + sum);

        double avg = sum / array.length;

        System.out.println("The avarage of the sum is " + avg);

        double max = array[0], min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max > array[i])
                max = array[i];
            if (min < array[i])
                min = array[i];
        }
        System.out.println("Maximum value is :" + max);
        System.out.println("Minimum value is :" + min);

    }

}
