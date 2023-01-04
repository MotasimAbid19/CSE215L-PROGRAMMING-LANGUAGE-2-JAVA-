
package lab13;


public class Triangle extends Shape {
    private double base;
    private double height ;
    
    public void Traiangle(){
        this.base= 1 ;
        this.height=1 ;
    }

    public Triangle(double base, double height) {
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
    public double getArea(){
        return 0.5*this.base*this.height ;
        
    }
    @Override
    public double getPerimeter(){
        double h = Math.sqrt((this.base*this.base)+(this.height*this.height));
        return h+this.base+this.height ;
    }
    @Override
    public String toString(){
       return  "Status for Rectangle instance: base:" + this.base+ " height: "+ this.height +" area: "+getArea()+ " perimeter : "+getPerimeter();
        
    }
    
    
}
