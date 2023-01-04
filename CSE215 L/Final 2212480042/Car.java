
public class Car implements Rentable{
    
    private String customerName ;
    private int yearOfModel ;
    private double totalhours ;

    public Car(String customerName, int yearOfModel, double totalhours) {
        this.customerName = customerName;
        this.yearOfModel = yearOfModel;
        this.totalhours = totalhours;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getYearOfModel() {
        return yearOfModel;
    }

    public void setYearOfModel(int yearOfModel) {
        this.yearOfModel = yearOfModel;
    }

    public double getTotalhours() {
        return totalhours;
    }

    public void setTotalhours(double totalhours) {
        this.totalhours = totalhours;
    }
    @Override
    public double getTotalAmounts(){
        if(this.totalhours<2015)
            return (1000*this.totalhours);
        else
            return (1500*this.totalhours);
    }
    
    @Override
    public double getAdvanceAmounts(){
        if(this.totalhours<2015)
            return (1000*this.totalhours*0.5);
        else
            return (1500*this.totalhours*0.5);
    }
    @Override
    public String toString(){
        return "CustomerNname = "+this.customerName+" heird a yearofModel "+this.yearOfModel+" for Totalhours "+this.totalhours+" hours";
    }
}
