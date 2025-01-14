package Lecture6.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tasks = new ArrayList<>();
        List<Boolean> completed = new ArrayList<>();
        boolean isMenuActive = true;
        while (isMenuActive) {
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. Remove Completed Tasks");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    completed.add(false);
                    break;
                case 2:
                    System.out.print("Enter task number to mark as completed: ");
                    int taskNumber = scanner.nextInt();
                    if (taskNumber > 0 && taskNumber <= tasks.size()) {
                        completed.set(taskNumber - 1, true);
                        System.out.println("Task marked as completed.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;
                case 3:
                    for (int i = tasks.size() - 1; i >= 0; i--) {
                        if (completed.get(i)) {
                            tasks.remove(i);
                            completed.remove(i);
                        }
                    }
                    System.out.println("Completed tasks removed.");
                    break;
                case 4:
                    System.out.println("\nCurrent Tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i) + (completed.get(i) ? " (Completed)" : ""));
                    }
                    break;
                case 5:
                    System.out.println("Exiting To-Do List. Goodbye!");
                    scanner.close();
                    //return;
                    isMenuActive=false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
