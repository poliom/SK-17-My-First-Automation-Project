package Lecture9.Exercises.Exercise04;

import java.util.ArrayList;
import java.util.List;

public class Product {
    // Static attribute to track the current sale category
    private static String categoryOnSale = null;
    // Static list to keep track of all products
    private static List<Product> allProducts = new ArrayList<>();

    // Instance attributes
    private String name;
    private double price;
    private String category;
    private boolean onSale;

    // Constructor
    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
        // Add the new product to the list of all products
        allProducts.add(this);
        updateSaleStatus();
    }

    // Static method to set the category currently on sale
    public static void setCategoryOnSale(String category) {
        categoryOnSale = category;
        // Update sale status for all products based on the new sale category
        updateAllProductsSaleStatus();
    }

    // Static method to update sale status for all products based on the current sale category
    private static void updateAllProductsSaleStatus() {
        for (Product product : allProducts) {
            product.updateSaleStatus();
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create some products
        Product p1 = new Product("Laptop", 1200, "Electronics");
        Product p2 = new Product("Phone", 800, "Electronics");
        Product p3 = new Product("Shirt", 30, "Clothing");

        // Set Electronics as the sale category
        Product.setCategoryOnSale("Electronics");

        // Print details of all products
        p1.printProductDetails();
        p2.printProductDetails();
        p3.printProductDetails();

        // Change the category of p1 and update the sale status
        p1.setCategory("Clothing");

        // Print details of all products again
        p1.printProductDetails();
        p2.printProductDetails();
        p3.printProductDetails();

        // Change sale category to Clothing
        Product.setCategoryOnSale("Clothing");

        // Print details of all products once more
        p1.printProductDetails();
        p2.printProductDetails();
        p3.printProductDetails();
    }

    // Method to calculate and return the discounted price if the product is on sale
    public double getDiscountedPrice() {
        if (onSale && price > 100) {
            return price * 0.90; // Apply a 10% discount
        }
        return price; // Return the original price if not on sale or price <= 100
    }

    // Method to print the product’s name, category, and price (discounted or original)
    public void printProductDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: $" + getDiscountedPrice());
    }

    // Method to change the product's category and update its sale status
    void setCategory(String newCategory) {
        this.category = newCategory;
        updateSaleStatus();
    }

    // Private method to update the sale status of this product based on the current sale category
    private void updateSaleStatus() {
        this.onSale = category.equals(categoryOnSale);
    }
}