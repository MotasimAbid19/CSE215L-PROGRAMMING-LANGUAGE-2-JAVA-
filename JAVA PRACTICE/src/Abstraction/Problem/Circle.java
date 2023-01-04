public class Circle extends Shape {
    Circle(double dim1 , double dim2){
        super(dim1, dim2);
    }

    @Override
    void Area(){
        System.out.println("Circle Area ="+(3.1416*dim1 *dim2));
    }
}
