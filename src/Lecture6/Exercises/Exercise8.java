package Lecture6.Exercises;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> customerQueue = new LinkedList<>();

        while (true) {
            System.out.println("\nCoffee Shop Queue Menu:");
            System.out.println("1. Add Customer");
            System.out.println("2. Serve Customer");
            System.out.println("3. View Current Line");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the customer's name: ");
                    String customerToAdd = scanner.nextLine();
                    customerQueue.add(customerToAdd);
                    System.out.println(customerToAdd + " added to the queue.");
                    break;
                case 2:
                    if (!customerQueue.isEmpty()) {
                        String servedCustomer = customerQueue.poll();
                        System.out.println(servedCustomer + " has been served.");
                    } else {
                        System.out.println("No customers in the queue to serve.");
                    }
                    break;
                case 3:
                    System.out.println("\nCurrent Queue:");
                    if (customerQueue.isEmpty()) {
                        System.out.println("The queue is empty.");
                    } else {
                        for (String customer : customerQueue) {
                            System.out.println(customer);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting Coffee Shop Queue Manager. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}