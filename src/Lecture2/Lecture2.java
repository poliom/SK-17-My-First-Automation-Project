package Lecture2;

import java.util.Scanner;

public class Lecture2 {
    public static void main(String[] args) {
        //dataTypes();
        //operators();
        //enterTextConsoleInput();
        enterTextScanner();
    }
    private static void enterTextScanner(){
        System.out.println("Enter text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("This is scanned text: " + text);
        int number = scanner.nextInt();
        System.out.println("This is scanned number: " + number);
    }
    private static void enterTextConsoleInput(){
        System.out.println("Please enter text");
        String inputText = System.console().readLine();
        System.out.println("This is your text: " + inputText);
    }
    private static void dataTypes() {
        System.out.println("Hello World!");
        System.out.println("My name is Vidko");

        int numberForFirstPrint = 100;
        System.out.println("My first number is: " + numberForFirstPrint);
        double firstDouble = 16.4;
        System.out.println(firstDouble);
        long firstLongNumber = 3000000000L;
        System.out.println(firstLongNumber);
        float firstFloatNumber = 2.5F;
        System.out.println(firstFloatNumber);
        char oneChar = '[';
        System.out.println(oneChar);
        boolean isBoolean = true;
        System.out.println(isBoolean);
        short myFirstShort = 15908;
        byte myByte = 127;

        String myFirstWord = "Vidko is in good mood";
        System.out.println(myFirstShort);
        System.out.println(myByte);
        System.out.println(myFirstWord);

        int number1 = 250;
        double number2 = number1;
        System.out.println("This is number 1: " + number1);
        System.out.println("This is number 2: " + number2);

        double number3 = 123.5;
        int number4 = (int) number3;
        System.out.println("This is number 3: " + number3);
        System.out.println("This is number 4: " + number4);

        double number5 = 123.5321523523552;
        float number6 = (float) number3;
        System.out.println("This is number 5: " + number5);
        System.out.println("This is number 6: " + number6);

        String stringNumber = "15.73";
        double number7 = Double.valueOf(stringNumber);
        System.out.println("This is string to number:" + number7);
        String stringNumber2 = "15s";
        int number8 = Integer.valueOf(stringNumber2);
        System.out.println("This is string to int:" + number8);
    }
    private static void operators(){
        int n1 = 12;
        int n2 = 5;
        int n3 = n1 + n2;
        double n4 = n1/n2;
        int n5 = n1*n2;
        int n6 = n1%n2;
        int n7 = ++n1; // ++x => x = x + 1
        int n8 = n1++;
        int n9 = n7;
        int n10 = n8;
        int n11 = --n2;
        System.out.println("This is number 3:" +n3);
        System.out.println("This is number 4:" +n4);
        System.out.println("This is number 5:" +n5);
        System.out.println("This is number 6:" +n6);
        System.out.println("This is number 7:" +n7);
        System.out.println("This is number 8:" +n8);
        System.out.println("This is number 9:" +n9);
        System.out.println("This is number 10:" +n10);
        System.out.println("This is number 11:" +n11);

        System.out.println("This is number 1:" +n1);
        System.out.println("This is number 2:" +n2);
    }
}
