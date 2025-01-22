package Lecture8.Exercises;public class Exercise9 {
    public static void main(String[] args) {
        // Example numbers
        int num1 = 121;
        int num2 = 3443;
        int num3 = 123;
        int num4 = 5;

        // Test the method
        System.out.println("Is " + num1 + " a palindrome? " + isPalindrome(num1)); // true
        System.out.println("Is " + num2 + " a palindrome? " + isPalindrome(num2)); // true
        System.out.println("Is " + num3 + " a palindrome? " + isPalindrome(num3)); // false
        System.out.println("Is " + num4 + " a palindrome? " + isPalindrome(num4)); // true
    }

    public static boolean isPalindrome(int number) {
        // Why we have this check?
        if (number < 0) {
            return false;
        }

        int originalNumber = number;
        int reversedNumber = 0;

        // Reverse the number
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Remove the last digit from the number
        }

        // Check if the reversed number is equal to the original number
        return originalNumber == reversedNumber;
    }
}
