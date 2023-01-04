public class Circle {
    private double radius ;
    public Circle(){
        radius = 1 ;
    }
    public Circle(double r){
        radius = r ;
    }
    public void setRadius (double r){
        radius = r ;
    }
    public double getRadius (){
        return radius ;
    }
    public double getArea(){
        return 3.1416 * radius * radius ;
    }
    public double getPerimeter(){
        return 2*3.1416 *radius ;
    }
    public String toString (){
        return getArea()+" "+getPerimeter()+" " ;
    }
}
