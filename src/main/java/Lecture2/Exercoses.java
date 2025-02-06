package Lecture2;

import java.util.Scanner;

public class Exercoses {
    public static void main(String[] args) {
        //exercise1();
        //exercise2();
        //exercise3();
        //exercise4();
        //exercise5();
        exercise6();
    }
    private static void exercise6(){
        System.out.println("Enter the number of seconds you would like to convert: ");
        Scanner scanner = new Scanner(System.in);
        long seconds = scanner.nextLong();

        long sumOfSecondsInDays = seconds/86400;
        //long sumOfSecondsInYears = seconds / (60 * 60 * 24 * 365);
        //long sumOfSecondsInYears = sumOfSecondsInDays/365;

        System.out.println("Seconds in years: " + sumOfSecondsInDays/365);
        System.out.println("Seconds in days: " + sumOfSecondsInDays);


        System.out.println("test more print");
    }
    private static void exercise5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side A with numbers only:");
        int sideA = scanner.nextInt();

        System.out.println("Enter side B with numbers only:");
        int sideB = scanner.nextByte();
// to check why
        System.out.println("Enter side C with numbers only:");
//        String sideCRaw = scanner.nextLine();
//        int sideC = Integer.parseInt(sideCRaw);

        int sideC = scanner.nextInt();
        //int sideCv1 = Integer.parseInt(scanner.nextLine());

        int perim = sideA + sideB + sideC;
        System.out.println("This is perimeter: " + perim);
    }
    private static void exercise4(){
        System.out.println("Here is your pine tree on 2 lines: ");
        System.out.println(" " + "*" + " ");
        System.out.println("*" + "*" + "*");
        System.out.println(" " + "|" + " ");

        System.out.println("Here is your pine tree on 3 lines: ");
        System.out.println( " " + " " + "*" + " " + " " );
        System.out.println(" " + "*" + "*" + "*");
        System.out.println("*" + "*" + "*" + "*" + "*");
    }
    private  static void exercise3(){
        int sideA = 4;
        int sideB = 6;
        int area = sideA * sideB;
        System.out.println("The area is: " + area);
    }
    private static void  exercise2(){
        int sideA = 3;
        int sideB = 5;
        int sideC = 2;
        int perim = sideA + sideB + sideC;
        System.out.println("This is perimeter: " + perim);
    }
    private static void  exercise1(){
        String firstName = "Mihail";
        String middleName = "Mihail2";
        String lastName = "Mihail3";
        System.out.println(firstName + " " + middleName + " "  + lastName);
    }
}
