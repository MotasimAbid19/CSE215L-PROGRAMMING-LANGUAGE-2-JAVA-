public class Triangle extends Shape {
    Triangle(double dim1 , double dim2 ){
        super(dim1, dim2);

    }

    @Override
    void Area(){
        System.out.println(" Triangle Area = "+(0.5*dim1*dim2));
    }
    
}
