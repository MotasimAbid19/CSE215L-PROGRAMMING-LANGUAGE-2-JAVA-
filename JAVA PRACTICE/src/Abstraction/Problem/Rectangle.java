public class Rectangle extends Shape{
    Rectangle(double dim1 , double dim2 ){
        super(dim1, dim2);
}
@Override 
void Area(){
    System.out.println("Rectangle Area ="+ (dim1*dim2));
}
    
}
