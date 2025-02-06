package Lecture4.Exercises;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a digit (1-7): ");
        int dayNumber = scanner.nextInt();

        String day = "";
        String suffix = "th";

        switch (dayNumber) {
            case 1:
                day = "Monday";
                suffix = "st";
                break;
            case 2:
                day = "Tuesday";
                suffix = "nd";
                break;
            case 3:
                day = "Wednesday";
                suffix = "rd";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                System.out.println("Invalid input. Please enter a digit between 1 and 7.");
                scanner.close();
                return;
        }

        System.out.println("The " + dayNumber + suffix + " day of the week is " + day + ".");

        scanner.close();
    }
}
