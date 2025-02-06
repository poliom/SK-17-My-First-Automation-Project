package Lecture8.Exercises;

public class Exercise3 {
    public static void main(String[] args) {
        String input = "example";

        String middle = findMiddleCharacter(input);
        System.out.println("The middle character(s): " + middle);
    }

    public static String findMiddleCharacter(String str) {

        int length = str.length();
        int middleIndex = length / 2;

        if (length % 2 == 0) {
            return str.substring(middleIndex - 1, middleIndex + 1);
        } else {
            return String.valueOf(str.charAt(middleIndex));
        }
    }
}
