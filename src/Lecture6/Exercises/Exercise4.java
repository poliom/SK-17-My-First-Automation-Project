package Lecture6.Exercises;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        way1();
        //way2();
    }

    public static void way1(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Element [%d]: ", i);
            array[i] = scanner.nextInt();
        }

        int maxElement = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }

        System.out.println("The biggest element in the array is: " + maxElement);

        scanner.close();
    }
    public static void way2(){
        int[] array = {324,124,542,31,51,145,1256,236};

        int maxElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }

        System.out.println("The biggest element in the array is: " + maxElement);
    }
}
