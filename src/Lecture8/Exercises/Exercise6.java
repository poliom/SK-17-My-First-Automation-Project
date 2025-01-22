package Lecture8.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
public class Exercise6 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};

        int[] uniqueNumbers = removeDuplicates(numbers);
        System.out.println("Array with unique elements: " + Arrays.toString(uniqueNumbers));
    }

    public static int[] removeDuplicates(int[] nums) {

        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (int num : nums) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        int[] uniqueArray = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            uniqueArray[i] = uniqueList.get(i);
        }

        return uniqueArray;
    }
}
