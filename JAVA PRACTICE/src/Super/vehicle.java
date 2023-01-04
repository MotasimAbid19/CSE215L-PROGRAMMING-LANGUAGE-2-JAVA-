public class vehicle {
    String colour ;
    double weight ;
    
    vehicle(String c , double w ){
        colour =c ;
        weight = w ;
    }
    public void attribute(){
        System.out.println("colour"+colour);
        System.out.println("Weight "+weight);
    }
}