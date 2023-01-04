import java.util.Scanner;


public class LAB6TASK5 {

    public static void findSumOfColumn(int[][] arr , int rowNo , int colNo)
    {
        int k = 1 ;
        
        for (int i = 0; i < colNo ; i++) 
        {
            int sum = 0 ;
            for (int j = 0; j < rowNo  ; j++) 
            {
                sum +=arr[j][i];
            }
            
            System.out.printf("Sum of %d coloumn is %d \n",k,sum);
            k++ ;
        } 

    }

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

        findSumOfColumn(arr , rowNo , colNo);


       }
}

