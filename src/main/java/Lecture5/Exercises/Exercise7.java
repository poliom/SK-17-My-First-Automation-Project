package Lecture5.Exercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // From google search how to select random number in java
        Random random = new Random();
        //+1 as it can be 0 and we are telling the user to enter between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        int userGuess = 0;

        System.out.println("Guess the number between 1 and 100:");

        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < numberToGuess) {
                System.out.println("Too low. Try again!");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high. Try again!");
            } else {
                System.out.println("Congratulations! You guessed the correct number!");
            }
        }

        scanner.close();
    }
}
