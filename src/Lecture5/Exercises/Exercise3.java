package Lecture5.Exercises;

public class Exercise3 {
    public static void main(String[] args) {
        int[] list1 = {10, 20, 30, 40, 50};
        int[] reversedList = new int[list1.length];

        for (int i = 0; i < list1.length; i++) {
            reversedList[i] = list1[list1.length - 1 - i];
        }

        System.out.println("Reversed list: ");
        for (int j : reversedList) {
            System.out.println(j);
        }
    }
}
