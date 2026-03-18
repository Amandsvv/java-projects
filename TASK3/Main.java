package TASK3;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter item name : ");
        String itemName = sc.nextLine();
        System.out.println("Enter 1 for category : Electronics, 2 for Groceries : ");
        int ch = sc.nextInt();
        System.out.println("Enter price : ");
        double price = sc.nextDouble();
        Inventory item = null;
        if(ch == 1){
             item = new Electronic(itemName, price);
        }else if(ch == 2){
             item = new Grocery(itemName, price);
        }else {
            System.out.println("Invalid category");
            sc.close();
            return;
        }
        HashMap<String, Double> inventoryDB = new HashMap<>();
        inventoryDB.put(item.getItem(), item.getPrice());

        item.showDetails();
        item.calculateGST();
        System.out.println("Inventory Updated");
        System.out.println(inventoryDB);
    }
}
