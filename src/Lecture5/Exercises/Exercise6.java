package Lecture5.Exercises;

public class Exercise6 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 31, 40, 50};

        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        double average = sum / numbers.length;
        System.out.println("The average is: " + average);
    }
}
