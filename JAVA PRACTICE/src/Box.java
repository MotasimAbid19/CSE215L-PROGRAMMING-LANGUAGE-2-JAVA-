public class Box {
    double height ;
    double width ;
    double depth ;

    Box(double h , double w , double d){
        height=h ;
        width=w;
        depth=d;
        

    }
    
    void DisplayVol(){
        double volumn = height * width * depth ;
        System.out.println("the volumn of the box is "+volumn);

    }
}
