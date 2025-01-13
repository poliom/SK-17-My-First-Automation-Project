package Lecture5.Exercises;

public class Exercise5 {
    public static void main(String[] args) {
        int[] numbers = {1234, 210, 30, 4041, 502,303,21,32,64};
        for (int num : numbers) {
            if (num % 3 == 0) {
                continue;
            }
            System.out.println("Number: " + num);
        }
    }
}
