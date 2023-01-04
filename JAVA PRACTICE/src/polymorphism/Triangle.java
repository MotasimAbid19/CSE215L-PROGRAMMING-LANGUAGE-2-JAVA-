

public class Triangle extends Shape {

    double base , height ;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    double area(){
        System.out.print("Triangle Class : ");
        return 0.5*base*height ;
    }
    
}
