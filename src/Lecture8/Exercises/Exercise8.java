package Lecture8.Exercises;

public class Exercise8 {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 7;

        System.out.println("Is " + num1 + " even? " + isEven(num1)); // Output: true
        System.out.println("Is " + num2 + " even? " + isEven(num2)); // Output: false
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
