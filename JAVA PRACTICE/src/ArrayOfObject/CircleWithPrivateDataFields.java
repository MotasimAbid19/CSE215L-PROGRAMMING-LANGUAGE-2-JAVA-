public class CircleWithPrivateDataFields {

    private double radius  ;
 
 public double getRadius() {
     return radius;
 }
 public CircleWithPrivateDataFields() {
     this.radius= 1 ;
 }
 
 public CircleWithPrivateDataFields(double radius) {
     this.radius = radius;
 }
 
 public void setRadius(double radius) {
     this.radius = radius;
 }
 
 public double getArea(){
     return Math.PI*this.radius*this.radius ;
 }
 
 
     
 }
 