package Lecture6.Exercises;

import java.util.LinkedList;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> contactList = new LinkedList<>();

        while (true) {
            System.out.println("\nContact List Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Remove Contact");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the contact name to add: ");
                    String contactToAdd = scanner.nextLine();
                    contactList.add(contactToAdd);
                    System.out.println("Contact added.");
                    break;
                case 2:
                    System.out.println("\nContact List:");
                    if (contactList.isEmpty()) {
                        System.out.println("No contacts available.");
                    } else {
                        for (String contact : contactList) {
                            System.out.println(contact);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter the contact name to remove: ");
                    String contactToRemove = scanner.nextLine();
                    if (contactList.remove(contactToRemove)) {
                        System.out.println("Contact removed.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting Contact List Manager. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
