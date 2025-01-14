package Lecture7.Exercises;

import java.util.ArrayList;
import java.util.HashMap;

public class Exercise1 {
    public static void main(String[] args) {
        HashMap<String,Integer> storeInventory = new HashMap<>();
        storeInventory.put("Banana", 20);
        storeInventory.put("Peanuts", 25);
        storeInventory.put("Water", 45);

        System.out.println("What is the quantity of Peanuts: " + storeInventory.get("Peanuts"));

        boolean isRestocked = storeInventory.replace("Banana", storeInventory.get("Banana"), (storeInventory.get("Banana")+35));

        if (isRestocked) {
            System.out.println("Restock Banana quantity with 35, the new quantity is: " + storeInventory.get("Banana"));
        }
        storeInventory.replace("Water", 0);
        storeInventory.replace("Banana", 0);
        // Option 1
        System.out.println("Option 1");
        ArrayList<String> outOfStock = new ArrayList<String>();
        for (String key: storeInventory.keySet()){
            if (0 == storeInventory.get(key)){
                outOfStock.add(key);
            }
        }
        for (String outOfStockItem : outOfStock) {
            System.out.println("The following product is out of stock: " + outOfStockItem);
        }
        // Option 2
        System.out.println("Option 2");
        for (String key: storeInventory.keySet()){
            if (0 == storeInventory.get(key)) {
                System.out.println("The following product is out of stock: " + key);
            }
        }
        System.out.println("Remove Peanuts from store: "+storeInventory.remove("Peanuts"));
        System.out.println("Print the entire inventory: "+storeInventory);
    }
}
