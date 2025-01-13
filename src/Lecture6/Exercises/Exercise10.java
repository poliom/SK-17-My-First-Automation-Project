package Lecture6.Exercises;

import java.util.Scanner;
import java.util.Stack;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> bookStack = new Stack<>();

        while (true) {
            System.out.println("\nBook Stack Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. View Top Book");
            System.out.println("3. Remove Top Book");
            System.out.println("4. Search and Retrieve Book");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the book title to add: ");
                    String bookToAdd = scanner.nextLine();
                    bookStack.push(bookToAdd);
                    System.out.println(bookToAdd + " added to the stack.");
                    break;
                case 2:
                    if (!bookStack.isEmpty()) {
                        System.out.println("Top book: " + bookStack.peek());
                    } else {
                        System.out.println("The stack is empty.");
                    }
                    break;
                case 3:
                    if (!bookStack.isEmpty()) {
                        String removedBook = bookStack.pop();
                        System.out.println(removedBook + " removed from the stack.");
                    } else {
                        System.out.println("The stack is empty.");
                    }
                    break;
                case 4:
                    System.out.print("Enter the book title to search and retrieve: ");
                    String bookToSearch = scanner.nextLine();
                    if (bookStack.contains(bookToSearch)) {
                        Stack<String> tempStack = new Stack<>();
                        while (!bookStack.peek().equals(bookToSearch)) {
                            tempStack.push(bookStack.pop());
                        }
                        System.out.println("Retrieved book: " + bookStack.pop());
                        while (!tempStack.isEmpty()) {
                            bookStack.push(tempStack.pop());
                        }
                    } else {
                        System.out.println("Book not found in the stack.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting Book Stack Manager. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
