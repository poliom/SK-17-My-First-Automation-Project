package Lecture7.Exercises;

import java.util.HashSet;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        // Create a new HashSet
        HashSet<String> guestList = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Party Guest List Manager!");

        while (running) {
            // Show menu options
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a guest");
            System.out.println("2. Remove a guest");
            System.out.println("3. Check if a person is on the guest list");
            System.out.println("4. View all guests");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // clean selection buffer

            switch (choice) {
                case 1:
                    // Add guest name
                    System.out.print("Enter guest name to add: ");
                    String guestToAdd = scanner.nextLine();
                    if (guestList.add(guestToAdd)) {
                        System.out.println(guestToAdd + " has been added to the guest list!");
                    } else {
                        System.out.println(guestToAdd + " is already on the guest list.");
                    }
                    break;

                case 2:
                    // Remove guest name
                    System.out.print("Enter guest name to remove: ");
                    String guestToRemove = scanner.nextLine();
                    if (guestList.remove(guestToRemove)) {
                        System.out.println(guestToRemove + " has been removed from the guest list.");
                    } else {
                        System.out.println(guestToRemove + " is not on the guest list.");
                    }
                    break;

                case 3:
                    // Check guest if is in the list
                    System.out.print("Enter guest name to check: ");
                    String guestToCheck = scanner.nextLine();
                    if (guestList.contains(guestToCheck)) {
                        System.out.println(guestToCheck + " is on the guest list.");
                    } else {
                        System.out.println(guestToCheck + " is not on the guest list.");
                    }
                    break;

                case 4:
                    // Show all guests
                    System.out.println("\nGuest List:");
                    if (guestList.isEmpty()) {
                        System.out.println("The guest list is empty.");
                    } else {
                        for (String guest : guestList) {
                            System.out.println("- " + guest);
                        }
                    }
                    break;

                case 5:
                    // Stop program
                    running = false;
                    System.out.println("Exiting the Guest List Manager. Have a great party!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
