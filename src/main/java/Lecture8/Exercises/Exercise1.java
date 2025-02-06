package Lecture8.Exercises;

public class Exercise1 {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 15;
        int num3 = 30;

        int smallestV1 = findSmallestV1(num1, num2, num3);
        System.out.println("The smallestV1 number is: " + smallestV1);

        int[] numbers = {25, 15,30};
        int smallestV2 = findSmallestV2(numbers);
        System.out.println("The smallestV2 number is: " + smallestV2);
    }

    // Method 1 for get the smallest number
    public static int findSmallestV1(int a, int b, int c) {
        int smallest = a;

        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }

        return smallest;
    }

    // Method 2 for get the smallest number
    public static int findSmallestV2(int[] numbers) {
        int smallest = numbers[0];

        for (int number : numbers){
            if (smallest>number){
                smallest = number;
            }
        }

        return smallest;
    }
}
