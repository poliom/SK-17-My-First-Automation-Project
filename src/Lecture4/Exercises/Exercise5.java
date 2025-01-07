package Lecture4.Exercises;
import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the type of vacation (Beach/Mountain): ");
        String vacationType = scanner.nextLine();

        System.out.print("Enter your budget per day per person: ");
        double budget = scanner.nextDouble();

        switch (vacationType.toLowerCase()) {
            case "beach":
                if (budget < 50) {
                    System.out.println("You should go to Bulgaria for a Beach vacation.");
                } else {
                    System.out.println("You should go Outside Bulgaria for a Beach vacation.");
                }
                break;
            case "mountain":
                if (budget < 30) {
                    System.out.println("You should go to Bulgaria for a Mountain vacation.");
                } else {
                    System.out.println("You should go Outside Bulgaria for a Mountain vacation.");
                }
                break;
            default:
                System.out.println("There is no information about this type of vacation.");
        }

        scanner.close();
    }
}
