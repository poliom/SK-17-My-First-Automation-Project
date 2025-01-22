package Lecture7.Exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {}
    public static void exampleSolutionOfExercise(){
        HashMap<String, Integer> inventory = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Store Inventory System!");

        while (running) {
            // Show options
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a product");
            System.out.println("2. Check product quantity");
            System.out.println("3. Restock a product");
            System.out.println("4. Mark a product as out of stock");
            System.out.println("5. Remove a product");
            System.out.println("6. View inventory");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // clean selection buffer

            switch (choice) {
                case 1:
                    // Add product
                    System.out.print("Enter product name: ");
                    String addProduct = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int addQuantity = scanner.nextInt();
                    inventory.put(addProduct, inventory.getOrDefault(addProduct, 0) + addQuantity);
                    System.out.println("Product added successfully!");
                    break;

                case 2:
                    // Check quantity
                    System.out.print("Enter product name to check: ");
                    String checkProduct = scanner.nextLine();
                    int quantity = inventory.getOrDefault(checkProduct, 0);
                    System.out.println("Quantity of " + checkProduct + ": " + quantity);
                    break;

                case 3:
                    // Restock product
                    System.out.print("Enter product name to restock: ");
                    String restockProduct = scanner.nextLine();
                    System.out.print("Enter quantity to add: ");
                    int restockQuantity = scanner.nextInt();
                    if (inventory.containsKey(restockProduct)) {
                        inventory.put(restockProduct, inventory.get(restockProduct) + restockQuantity);
                        System.out.println("Product restocked successfully!");
                    } else {
                        System.out.println("Product not found in inventory.");
                    }
                    break;

                case 4:
                    // Mark product as out of stock
                    System.out.print("Enter product name to mark as out of stock: ");
                    String outOfStockProduct = scanner.nextLine();
                    if (inventory.containsKey(outOfStockProduct)) {
                        inventory.put(outOfStockProduct, 0);
                        System.out.println("Product marked as out of stock!");
                    } else {
                        System.out.println("Product not found in inventory.");
                    }
                    break;

                case 5:
                    // Remove product
                    System.out.print("Enter product name to remove: ");
                    String removeProduct = scanner.nextLine();
                    if (inventory.containsKey(removeProduct)) {
                        inventory.remove(removeProduct);
                        System.out.println("Product removed successfully!");
                    } else {
                        System.out.println("Product not found in inventory.");
                    }
                    break;

                case 6:
                    // View inventory
                    System.out.println("\nCurrent Inventory:");
                    if (inventory.isEmpty()) {
                        System.out.println("Inventory is empty.");
                    } else {
                        for (var entry : inventory.entrySet()) {
                            System.out.println(entry.getKey() + ": " + entry.getValue());
                        }
                    }
                    break;

                case 7:
                    // Close program
                    running = false;
                    System.out.println("Exiting the inventory system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    public static void codeOfExerciseDuringLecture(){
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
