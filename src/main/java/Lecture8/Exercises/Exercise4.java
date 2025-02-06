package Lecture8.Exercises;

public class Exercise4 {
    public static void main(String[] args) {
        // Example string
        String input = "  This is a simple example   ";

        int wordCount = countWords(input);
        System.out.println("Number of valid words: " + wordCount);

        int wordCountAdvanced = countWordsAdvanced(input);
        System.out.println("Advanced count of the Number of valid words: " + wordCountAdvanced);
    }

    public static int countWordsAdvanced(String str) {
        if (str == null || str.trim().isEmpty()) {
            System.out.println("Input string is empty or contains only spaces.");
            return 0;
        }

        // Remove spaces from start and end of the string
        str = str.trim();

        // Split the string to words
        String[] words = str.split("\\s+");

        // Function to count only the words with more than 2 symbols, it uses Regex
        int count = 0;
        for (String word : words) {
            if (word.matches("[a-zA-Z]{3,}")) { // this is regex"[a-zA-Z]{3,}"
                count++;
            }
        }

        return count;
    }

    // Count the words
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            System.out.println("Input string is empty or contains only spaces.");
            return 0;
        }

        // Премахваме водещите и завършващи интервали
        str = str.trim();

        // Разделяме думите, използвайки интервали като разделител
        String[] words = splitBySpace(str);

        // Броим само думите с дължина над 2 символа и съдържащи само букви
        int count = 0;
        for (String word : words) {
            if (isValidWord(word)) {
                count++;
            }
        }

        return count;
    }

    // Split the string to a words
    public static String[] splitBySpace(String str) {
        // Split the string on space
        String[] temp = str.split(" ");
        int actualWordCount = 0;

        // Count not empty parts
        for (String part : temp) {
            if (!part.isEmpty()) {
                actualWordCount++;
            }
        }

        // Count the valid words
        String[] words = new String[actualWordCount];
        int index = 0;
        for (String part : temp) {
            if (!part.isEmpty()) {
                words[index++] = part;
            }
        }

        return words;
    }

    // Validation of word
    public static boolean isValidWord(String word) {
        // check if the word is with more than 2 symbols
        if (word.length() < 3) {
            return false;
        }

        // Check if we have only letters
        for (char symbol : word.toCharArray()) {
            if (!Character.isLetter(symbol)) {
                return false;
            }
        }

        return true;
    }
}
