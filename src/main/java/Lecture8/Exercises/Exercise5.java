package Lecture8.Exercises;

public class Exercise5 {
    public static void main(String[] args) {

        int[] numbers = {12, 35, 1, 10, 34, 1};

        //validation if there is no second-largest number, when use scanner as input
        /*
         if (numbers == null || numbers.length < 2) {
             System.out.println("Array must contain at least two elements.");
             return;
         }
        */

        int secondLargest = findSecondLargest(numbers);

        if (secondLargest == -1) {
            System.out.println("No second largest number found.");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
        }
    }

    public static int findSecondLargest(int[] numbers) {
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        int secondLargest = -2147483648; // why is used this number?
        for (int num : numbers) {
            if (num != largest && num > secondLargest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}
