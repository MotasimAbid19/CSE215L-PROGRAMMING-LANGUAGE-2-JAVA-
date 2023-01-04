public class Rectangle {
    private double height ; 
    private double width ;

    public Rectangle(){
        height=1 ;
        width = 1;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public Rectangle(double width , double height){

        this.height = height ;
        this.width = width ;
    }
    public double printWidth(){
        return this.width ;
    }
    public double printHeight(){
        return this.height ;
    }
    public double getArea(){
        return height*width ;
    }
    public double getPerimeter(){
        return 2*(height+width);
    }  
}
