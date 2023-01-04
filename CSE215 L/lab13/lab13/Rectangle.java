
package lab13;


public class Rectangle extends Shape {
    private double length ;
    private double width ;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public void Rectangle()
    {
        this.length = 1 ;
        this.width = 1 ;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    @Override
    public double getArea(){
        return this.width*this.length ;
        
    }
    @Override
    public double getPerimeter(){
        return 2*(this.length+this.width);
        
    }
    @Override
    public String toString(){
        return "Status for Rectangle instance: length:" + this.length+ " width: "+ this.width +" area: "+getArea()+ " perimeter : "+getPerimeter();

    }
    
    
}
