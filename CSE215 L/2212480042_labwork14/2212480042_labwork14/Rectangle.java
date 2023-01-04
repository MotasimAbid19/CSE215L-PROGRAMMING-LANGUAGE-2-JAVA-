public class Rectangle implements Shape {
    private double width;
    private double lenght;
    public Rectangle(){

    }
    public Rectangle(double width,double lenght){
        this.lenght=lenght;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public double area() {
        return this.lenght*this.width;
    }

    @Override
    public double perimeter() {
        return 2*(this.lenght+this.width);
    }
    public String toString(){
        return "width ="+getWidth()+"lenght"+getLenght()+"area = "+area()+"perimeter = "+perimeter();
    }
}
