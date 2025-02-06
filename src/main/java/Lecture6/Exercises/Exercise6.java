package Lecture6.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise6 {
    /*
     There is a problem in this program
     Please check the code, check the description of the task
     Think about what is missing or what is wrong
     Suggest fix to the code in order the program to work normal
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> lotteryNumbers = new ArrayList<>();

        while (true) {
            System.out.println("\nLottery Manager Menu:");
            System.out.println("1. Add Lottery Number");
            System.out.println("2. View Winning Numbers");
            System.out.println("3. Check if a Number is a Winning Number");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a lottery number to add: ");
                    int numberToAdd = scanner.nextInt();
                    lotteryNumbers.add(numberToAdd);
                    System.out.println("Number added.");
                    break;
                case 2:
                    System.out.println("\nWinning Numbers:");
                    if (lotteryNumbers.isEmpty()) {
                        System.out.println("No numbers added yet.");
                    } else {
                        for (int num : lotteryNumbers) {
                            System.out.println(num);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter a number to check: ");
                    int numberToCheck = scanner.nextInt();
                    if (lotteryNumbers.contains(numberToCheck)) {
                        System.out.println("Congratulations! The number is a winning number.");
                    } else {
                        System.out.println("Sorry, this number is not a winning number.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting Lottery Manager. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
