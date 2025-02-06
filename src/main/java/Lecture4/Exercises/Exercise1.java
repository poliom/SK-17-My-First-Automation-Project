package Lecture4.Exercises;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first angle: ");
        int angle1 = scanner.nextInt();

        System.out.println("Enter the second angle: ");
        int angle2 = scanner.nextInt();

        System.out.println("Enter the third angle: ");
        int angle3 = scanner.nextInt();

        if (angle1 + angle2 + angle3 == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {
            System.out.println("The triangle can be built.");

            if (angle1 == 60 && angle2 == 60 && angle3 == 60) {
                System.out.println("The triangle is equilateral (равностранен). ");
            } else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
                System.out.println("The triangle is isosceles (равнобедрен). ");
            } else {
                System.out.println("The triangle is multifaceted (разностранен). ");
            }

            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("The triangle is right-angled (правоъгълен). ");
            } else if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
                System.out.println("The triangle is obtuse (тъпоъгълен). ");
            } else {
                System.out.println("The triangle is acute (остроъгълен). ");
            }

        } else {
            System.out.println("The triangle can't be built based on the angle values.");
        }

        scanner.close();
    }
}
