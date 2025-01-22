package Lecture8.Exercises;

public class Exercise7 {
    public static void main(String[] args) {
        String input1 = "Hello, world!";
        String input2 = "";
        String input3 = "A";

        System.out.println("Last character: " + getLastCharacter(input1)); // Output: !
        System.out.println("Last character: " + getLastCharacter(input2)); // Output: No last character found.
        System.out.println("Last character: " + getLastCharacter(input3)); // Output: A
    }

    public static String getLastCharacter(String str) {
        if (str == null || str.isEmpty()) {
            return "No last character found.";
        }
        return String.valueOf(str.charAt(str.length() - 1));
    }
}
