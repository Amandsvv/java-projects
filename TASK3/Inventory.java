package TASK3;

abstract class Inventory {
    private String itemName;
    private double price;
    
    Inventory(String itemName, double price){
        setItem(itemName);
        setPrice(price);
    }
    public void setItem(String itemName){
        this.itemName = itemName;
    }
    public String getItem(){
        return this.itemName;
    }
    public void setPrice(double price){
        if(price < 0) price = 0;
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }

    public void showDetails(){
        System.out.println("Item : "+ getItem() + " Price : "+ getPrice());
    }

    abstract void calculateGST();
}

