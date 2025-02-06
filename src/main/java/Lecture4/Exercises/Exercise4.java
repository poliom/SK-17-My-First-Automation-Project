package Lecture4.Exercises;
import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double discountRate = 0.0;
        if (quantity >= 100 && quantity <= 120) {
            discountRate = 0.15;
        } else if (quantity > 120) {
            discountRate = 0.20;
        }

        double totalAmount = unitPrice * quantity;
        double discountAmount = totalAmount * discountRate;
        double revenue = totalAmount - discountAmount;

        System.out.println("The revenue from sale: " + revenue + "$ ");
        System.out.println("Discount: " + discountAmount + "$ (" + (discountRate * 100) + "%)");

        scanner.close();
    }
}
