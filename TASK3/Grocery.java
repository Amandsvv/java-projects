package TASK3;

public class Grocery extends Inventory {
    public Grocery(String itemName, double price){
        super(itemName, price);
    }

    void calculateGST(){
        double price = getPrice();
        double gstAdded = (price * 5) / 100;
        setPrice(price + gstAdded);
        System.out.println("GST added 18%");
    }
}
