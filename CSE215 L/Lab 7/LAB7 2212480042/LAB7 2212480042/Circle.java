public class Circle {
    private double radius ;
    static int count = 0 ;
    public Circle(){
        radius = 1 ;
        count++ ;
    }
    public Circle(double r){
        radius = r ;
        count++;
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
        return 2*3.1416 * radius ;
    }
    public String toString (){
        return " Radius "+radius+" Area "+getArea()+" Perimeter "+getPerimeter() ;
    }
    public static int CircleCount(){
        return count ;
    }
    
}
