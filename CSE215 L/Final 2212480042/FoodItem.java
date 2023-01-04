
public class FoodItem {
    private String name ;
    private double price ;
    private static int noOfItems = 0 ;
    public FoodItem(){
        this.name = "Burger";
        this.price = 200;
        noOfItems++ ;
        
    }

    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
        noOfItems++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getNoOfItems() {
        return noOfItems;
    }
  
}
