package TASK3;

public class Electronic extends Inventory {
    public Electronic(String item, double price){
        super(item, price);
    }
    @Override
    void calculateGST(){
        double price = getPrice();
        double gstAdded = (price * 18) / 100;
        System.out.println("GST Aplied 18% : "+gstAdded);
    }
}
