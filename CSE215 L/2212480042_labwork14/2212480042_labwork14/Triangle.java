public class Triangle implements Shape{
    private double base;
    private double height;

    public Triangle(){

    }
    public Triangle(double base ,double height){
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return .5*this.base*this.height;
    }

    @Override
    public double perimeter() {
        double h = Math.sqrt((this.base*this.base)+(this.height*this.height));
        return h*(this.base+this.height);
    }
    public String toString(){
        return "base = "+getBase()+"height = "+getHeight()+"area = "+area()+"perimeter = "+perimeter();
    }

}
