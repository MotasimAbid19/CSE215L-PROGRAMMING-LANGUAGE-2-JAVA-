public class foreachloop {

    public static void main(String[] args) {
        int[] num = {10,20,30,40,50,60};

        int sum = 0 ;

        for(int x : num)
        {
            System.out.println(x+" " );
            sum = sum + x ;
        }
        System.out.println("the sum is "+sum);
    }
}
