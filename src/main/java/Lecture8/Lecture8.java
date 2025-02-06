package Lecture8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Lecture8 {
    public static void main(String[] args){
        //demoMethods();
        //prepareMeal();
        methodOverloading();
    }

    private static void methodOverloading() {
        int number1 = 5;
        int number2 = 10;
        int sumTwoNumbers = sumNumbers(number1, number2);
        double number3 = 25.6;
        double number4 = 5.4;
        double sumTwoDoubleNUmbers = sumNumbers(number3, number4);
        double sumOfIntAndDoubleNumbers = sumNumbers(number1,number3);
        System.out.println("Print summed numbers");
        System.out.println("Int sum: "+sumTwoNumbers);
        System.out.println("Double sum: "+sumTwoDoubleNUmbers);
        System.out.println("Int+Double sum: "+sumOfIntAndDoubleNumbers);
        double sumOfStringInDouble = sumNumbers("1","2.56");
        System.out.println("Sum of strings: " +sumOfStringInDouble);
        double sumOf3 = sumNumbers(24,5.73,8.23);
        System.out.println("Sum of 3 numbers is: " + sumOf3);
    }

    public static void demoMethods(){
        System.out.println("Hello World!");
        int a = 10;
        int b = 20;
        sumNumbers(a,b);
        diffNumbers(a,b);
        System.out.println("End code");
        doBothCalculations();
        int[] numberOfYears = {1990,1970,1852,2025};
        sumAllNumbersInArray(numberOfYears, "Years of people");
        sumAllNumbersInArray(new int[]{2134, 15, 216, 15}, "Random numbers");
        printBiggerSumOfInternalAndExternalList(new int[]{2134, 15, 216, 15}, "Random numbers");
        ArrayList<String> textList = new ArrayList<>();
        textList.add("test");
        textList.add("Something");
        textList.add("blabla");
        methodForPrintTextFromArrayList(textList);
    }

    private static void methodForPrintTextFromArrayList(ArrayList<String> textList) {
        for (String text : textList){
            System.out.println("This is text from the ArrayList: "+ text);
        }
    }

    public static int sumAllNumbersInArray(int[]numbers, String arrayName){
        System.out.println("Sum numbers from array");
        int sum=0;
        for(int number:numbers){
            sum = sum+number;
        }
        System.out.println("The sum of numbers in " + arrayName + " array is: " + sum);
        if (sum<0){
            System.out.println("The sum is negative and method returns only positive numbers. Due to this the sum is set to 0");
            return 0;
        }
        return sum;
    }

    private static void doBothCalculations() {
        sumNumbers(10, 20);
        diffNumbers(25,5);
    }

    public static int sumNumbers(int firstNumber, int secondNumber){
        int sum = (firstNumber+secondNumber);
        System.out.println("Sum of a and b is: "+sum);
        return sum;
    }
    public static double sumNumbers(double firstNumber, double secondNumber){
        double sum = (firstNumber+secondNumber);
        System.out.println("Sum of a and b is: "+sum);
        return sum;
    }
    public static double sumNumbers(int firstNumber, double secondNumber){
        double sum = (firstNumber+secondNumber);
        System.out.println("Sum of a and b is: "+sum);
        return sum;
    }
    public static double sumNumbers(int firstNumber, double secondNumber, double number3){
        double sum = (firstNumber+secondNumber+number3);
        System.out.println("Sum of a and b is: "+sum);
        return sum;
    }
    public static double sumNumbers(String firstNumber, String secondNumber){
        double num1 = Double.parseDouble(firstNumber);
        double num2 = Double.parseDouble(secondNumber);
        double sum = (num1+num2);
        System.out.println("Sum of a and b is: "+sum);
        return sum;
    }

    public static void diffNumbers(int a, int b){
        System.out.println("Differance of a and b is: "+(b-a));
    }

    public static int[] internalArrayOfNumbers(){
        System.out.println("Internal method for returning only numbers");
        return new int[]{58,121,369,41,6563};
    }

    public static void printBiggerSumOfInternalAndExternalList(int[] numbers, String arrayName){
        System.out.println("Method for calculate sums and compare them");
        //int[] internalNumbers = internalArrayOfNumbers();
        int sumExternal = sumAllNumbersInArray(numbers,arrayName);
        int sumInternal = sumAllNumbersInArray(internalArrayOfNumbers(), "Internal numbers");

        if (sumInternal>sumExternal){
            System.out.println("The bigger number of sums is the internal and it is: "+sumInternal);
        } else if (sumInternal<sumExternal) {
            System.out.println("The bigger number of sums is the external and it is: "+sumExternal);
        }
        else {
            System.out.println("Both sums are =");
        }
    }

    public static void prepareMeal(){
        String mainDish = cookMainDish();
        String sideDish = prepareSideDish();
        System.out.println("Serving the meal ...");
        System.out.println("Main Dish: " + mainDish);
        System.out.println("Side Dish: " + sideDish);
        System.out.println("Meal served successfully");
    }

    private static String prepareSideDish() {
        String sideDish = returnDishes();
        System.out.println("Preparing Side Dish");
        System.out.println("Side Dish is prepared");
        return sideDish;
    }

    private static String returnDishes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a dish:");
        return scanner.nextLine();
    }

    private static String cookMainDish() {
        String mainDish = returnDishes();
        System.out.println("Preparing Main Dish");
        System.out.println("Main Dish is prepared");
        return mainDish;
    }
}
