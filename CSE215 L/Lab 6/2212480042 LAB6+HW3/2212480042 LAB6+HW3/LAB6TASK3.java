import java.util.Scanner;

public class LAB6TASK3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of size ");
        int size = input.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        int min = findMinElement(array);
        int max = findMaxElement(array);

        System.out.println("The maximum value in the array is " + max);
        System.out.println("The minimum value in the array is " + min);

    }

    public static int findMinElement(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;

    }

    public static int findMaxElement(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

}
