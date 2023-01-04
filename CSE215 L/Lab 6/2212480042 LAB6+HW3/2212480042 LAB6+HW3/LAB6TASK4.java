import java.util.Scanner;


public class LAB6TASK4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rowNo = 3, colNo = 3;
        int[][] arr = new int[rowNo][colNo];
        System.out.print("Enter " + rowNo + "x" + colNo + "matrix elements: ");
        for (int i = 0; i < rowNo ; i++) 
        {
            for (int j = 0; j < colNo  ; j++) 
            {
                arr[i][j] = input.nextInt();
            }
        } 
        findHighestSumOfRow (arr ,  rowNo , colNo);
    }
    public static void findHighestSumOfRow (int[][] arr , int rowNo , int colNo)
    {
        int pos = 0 ;
            int max = 1 ;
        for (int i = 0; i < rowNo ; i++) 
        {
            
            int sum = 0 ;
            for (int j = 0; j < colNo  ; j++) 
            {
                
                sum+= arr[i][j];
            }

            if(max < sum)
            {
                max = sum ;
                pos = i ;
            }
        } 
        int position= pos + 1 ;
        System.out.println("Row "+position+" has the largest sum in the matrix");

    }
}
