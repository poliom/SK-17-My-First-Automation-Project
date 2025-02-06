package Lecture8.Exercises;

public class Exercise2 {
    public static void main(String[] args) {

        double num1 = 10;
        double num2 = 20;
        double num3 = 30;

        double average = computeAverage(num1, num2, num3);
        System.out.println("The average is: " + average);
    }

    public static double computeAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
