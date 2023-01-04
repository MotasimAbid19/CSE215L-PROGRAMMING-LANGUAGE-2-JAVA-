

public class Rectangle extends GeometricObject{
    private double width ;
    private double height ;
    public Rectangle(){
        this.width = 1 ;
        this.height = 1;
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle(String colour, boolean filler, double width, double height) {
        super(colour, filler);
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){

        return this.width*this.height ;
    }
    public double getPerimeter(){

        return 2*(this.height*this.width);
    }
    
    
}
