package Lecture10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lecture10 {
    public static void main(String[] args) {
//        arithmeticException();
//        illegalArgumentException(3);
//        try {
//            illegalArgumentException(-3);
//        }catch (IllegalArgumentException exceptionMessage){
//            System.out.println("The argument is illegal for this method");
//            System.out.println("Exception message: " + exceptionMessage);
//        }
//       illegalArgumentException(7);
        //String path = "src/Lecture10/text1.txt";
        //openFile(path);
////        System.out.println(parseStringToInt("23"));
////        System.out.println(parseStringToInt("Two"));
        //multipleCatch("2");
        //multipleCatch("two");
//        getMoney(300);
//        getMoney(1000);
        questionDemo();
    }
    public static void arithmeticException(){
        try{
            int number = 10 / 0;
            System.out.println("Result is: " + number);
        }catch (ArithmeticException internalExceptionMessage){
            System.out.println("The arithmetic operation can`t be done, internal exception: ");
            System.out.println(internalExceptionMessage);
        }
    }

    public static void illegalArgumentException(int age) throws IllegalArgumentException{
        if (age<0) {
            throw new IllegalArgumentException("Age should not be negative");
        }
        System.out.println("Your age is " + age);
    }

    public static void openFile(String path) {
        Scanner scanner = null;
        try{
            File file = new File(path);
            scanner = new Scanner(file);
            System.out.println("File content:");
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (FileNotFoundException exceptionMessage){
            System.out.println("File not found");
        }finally {
            if (scanner != null){
                scanner.close();
            }
        }
    }

    public static int parseStringToInt(String number){
        try{
            return Integer.parseInt(number);
        }catch(NumberFormatException exceptionMessage){
            System.out.println("The input is not a number");
            return -2147483648;
        }
    }

    public static void multipleCatch(String textNumber){
        try{
            int num = Integer.parseInt(textNumber);
            int number = num / 0;
            System.out.println("Result is: " + number);
        }catch (NumberFormatException exceptionMessage){
            System.out.println("The parse is not done");
//        }catch (ArithmeticException internalExceptionMessage){
//            System.out.println("The arithmetic operation can`t be done, internal exception: ");
//            System.out.println(internalExceptionMessage);
        }
    }

    public static void getMoney(int money){
        int bankMoney = 500;
        if (bankMoney<money){
            throw new IllegalArgumentException("Not enough money in bank");
        }
        System.out.println("Here are you money. You have left with " + (bankMoney-money) + " in your bank");
    }

    public static void catchThemAll(){
        try{
            throw new InputMismatchException("test");
        } catch (InputMismatchException exception1) {
            System.out.println("The expected input was not integer.");
        } catch (Exception exception){

        }
    }

    public static void questionDemo(){

        int count =0;
        while (count<1) {
            int number = getNumber();
            if (number != -1){
                count++;
            }
//            try {
//                System.out.println("Enter an integer: ");
//                int number = scanner.nextInt();
//                System.out.println("You entered a number - " + number);
//                break;
//            } catch (InputMismatchException exception1) {
//                System.out.println("The expected input was integer.");
//                System.out.println("This is the Java runtime exception: " + exception1);
//                System.out.println("Please try again to enter an integer: ");
//                scanner.nextLine();
//            }
//            finally {
//                scanner.close();
//                //IllegalStateException: Scanner closed - will be generated
//            }
        }
    }

    private static int getNumber(){
        int number = -1;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter an integer: ");
            number = scanner.nextInt();
            System.out.println("You entered a number - " + number);
        } catch (InputMismatchException exception1) {
            System.out.println("The expected input was not integer.");
            System.out.println("This is the Java runtime exception: " + exception1);
            System.out.println("Please try again to enter an integer: ");
        }
        scanner.close();

        return number;
    }
}
