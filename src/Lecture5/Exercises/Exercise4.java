package Lecture5.Exercises;

public class Exercise4 {
    public static void main(String[] args) {
        int[] arrayNumbers = {124,12,53,25,632,64,122,67,32};
        for (int num : arrayNumbers) {
            if (num % 5 == 0) {
                System.out.println("First multiple of 5: " + num);
                break;
            }
        }
    }
}
