
public class Van implements Rentable {
    private String customerName ;
    private double weightCapacity ;
    private double totalhours ;
    
    public Van(){
        this.customerName = "Abid";
        this.weightCapacity = 3600;
        this.totalhours = 15;
    }

    public Van(String customerName, double weightCapacity, double totalhours) {
        this.customerName = customerName;
        this.weightCapacity = weightCapacity;
        this.totalhours = totalhours;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(double weightCapacity) {
        this.weightCapacity = weightCapacity;
    }

    public double getTotalhours() {
        return totalhours;
    }

    public void setTotalhours(double totalhours) {
        this.totalhours = totalhours;
    }
    
    @Override
    public double getTotalAmounts(){
        if(this.weightCapacity>3500)
            return (2500*this.totalhours);
        else
            return (2000*this.totalhours);
    }
    
    @Override
    public double getAdvanceAmounts(){
        if(this.weightCapacity>3500)
            return (2500*this.totalhours*0.6);
        else
            return (2000*this.totalhours*0.6);
        
    }
    @Override
    public String toString(){
        return "CustomerNname = "+this.customerName+" heird a capacity of wrightCapacity "+this.weightCapacity+" for Totalhours "+this.totalhours+" hours";
    }
    
    
    
}
