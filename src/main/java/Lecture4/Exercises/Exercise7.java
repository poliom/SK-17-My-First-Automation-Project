package Lecture4.Exercises;
import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Convert to (C)elsius or (F)ahrenheit? Enter C or F: ");
        char choice = scanner.next().toUpperCase().charAt(0);

        if (choice == 'C') {
            double celsius = (temperature - 32) * 5 / 9;
            System.out.printf("The temperature in Celsius is: %.2f°C%n", celsius);
        } else if (choice == 'F') {
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.printf("The temperature in Fahrenheit is: %.2f°F%n", fahrenheit);
        } else {
            System.out.println("Invalid choice. Please enter C or F.");
        }

        scanner.close();
    }
}
