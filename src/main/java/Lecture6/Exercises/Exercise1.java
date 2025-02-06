package Lecture6.Exercises;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        int[] numbers = {65,84,-964,24,4};
        int sum = 0;
        for (int number:numbers){
            sum=sum+number;
        }
        System.out.println("The sum of numbers is: "+sum);
        //advanced with external libs
        //System.out.println("SuM: "+ Arrays.stream(numbers).sum());
    }
}
