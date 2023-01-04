public class varargs {

    void sum(int ... num){
        int sum = 0 ;
        for (int i : num) {
            sum=sum+i ;
        }

        System.out.println("The sum is "+sum);

    }
    
}
