package Lecture4;

import java.util.Scanner;

public class Lecture4 {
    public static void main(String[] args) {
        // System.out.println("Hello lecture 4!");
        // arithmeticOperators();
        // assignmentOperators();
        // comparisonOperators();
        // logicalOperators();
        // statements();
        // switchStatements();
        triangleBuilder();
    }
    public static void arithmeticOperators(){
        int num1 = 100;
        int num2 = 200;
        System.out.println("This is result of num1 + num2: " + (num1+num2));
        System.out.println("This is result of num1 - num2: " + (num1-num2));
        System.out.println("This is result of num2 - num1: " + (num2-num1));
        System.out.println("This is result of num1 * num2: " + (num1*num2));
        System.out.println("This is result of num1 / num2: " + (num1/num2));
        System.out.println("This is result of num2 / num1: " + (num2/num1));
        System.out.println("This is result of num1 % num2: " + (num1%num2));
        System.out.println("This is result of num2 % num1: " + (num2%num1));
        System.out.println(("This is increment after print of num1:"+ num1++));
        System.out.println(("This is decrement after print of num1:"+ num2--));
        System.out.println("This is num1: "+ num1);
        System.out.println("This is num2: "+ num2);
        System.out.println(("This is increment before print of num1:"+ ++num1));
        System.out.println(("This is decrement before print of num1:"+ --num2));
        System.out.println("This is num1: "+ num1);
        System.out.println("This is num2: "+ num2);
    }
    public static void assignmentOperators(){
        int num1 = 58;
        System.out.println("This is +=5 of num1: " + (num1+=5));
        System.out.println("This is -=5 of num1: " + (num1-=5));
        System.out.println("This is *=5 of num1: " + (num1*=5));
        System.out.println("This is /=5 of num1: " + (num1/=5));
        System.out.println("This is %=5 of num1: " + (num1%=5));
    }
    public static void comparisonOperators(){
        int num1 = 10;
        int num2 = 20;
        int num3 = 10;

        System.out.println("This is == of num1 and num2: " + (num1==num2)); // false
        System.out.println("This is == of num1 and num3: " + (num1==num3)); // true
        System.out.println("This is != of num1 and num2: " + (num1!=num2)); // true
        System.out.println("This is != of num1 and num3: " + (num1!=num3)); // false
        System.out.println("This is > of num1 and num2: " + (num1>num2)); // false
        System.out.println("This is < of num1 and num2: " + (num1<num2)); // true
        System.out.println("This is > of num1 and num3: " + (num1>num3)); // false
        System.out.println("This is < of num1 and num3: " + (num1<num3)); // false
        System.out.println("This is >= of num1 and num2: " + (num1>=num2)); // false
        System.out.println("This is <= of num1 and num2: " + (num1<=num2)); // true
        System.out.println("This is >= of num1 and num3: " + (num1>=num3)); // true
        System.out.println("This is <= of num1 and num3: " + (num1<=num3)); // true
    }
    public static void logicalOperators(){
        System.out.println("Presentation table line 1");
        int x = 3;
        System.out.println("This is x>1 && x==3: " + ((x>1)&&(x==3)));
        System.out.println("This is x>1 || x==3: " + ((x>1)||(x==3)));
        System.out.println("This is !(x>1) : " + (!(x>1)));

        System.out.println("Presentation table line 2");
        x = 4;
        System.out.println("This is x>1 && x==3: " + ((x>1)&&(x==3)));
        System.out.println("This is x>1 || x==3: " + ((x>1)||(x==3)));
        System.out.println("This is !(x>1) : " + (!(x>1)));

        System.out.println("Presentation table line 3");
        x = 0;
        System.out.println("This is x>1 && x<=3: " + ((x>1)&&(x<=3)));
        System.out.println("This is x>1 || x<=3: " + ((x>1)||(x<=3)));
        System.out.println("This is !(x>1) : " + (!(x>1)));

        System.out.println("Presentation table line 4");
        x = 1;
        System.out.println("This is x>1 && x==3: " + ((x>1)&&(x==3)));
        System.out.println("This is x>1 || x==3: " + ((x>1)||(x==3)));
        System.out.println("This is !(x>1) : " + (!(x>1)));
    }
    public static void statements(){
        int num1 = 10;
        int num2 = 20;
        if (num1<num2){
            System.out.println("Num 1 is < to num 2");
        }

        if (num1==num2){
            System.out.println("Num 1 is == to num 2");
        }
        else {
            System.out.println("Num 1 is not == to num 2");
        }

        System.out.println("If-esle-if");
        int num3 = 30;

        if (num1==num2){
            System.out.println("Num 1 == num 2"); // false
        }
        else  if (num1 > num2) {
            System.out.println("Num 1 > num 2"); // false
        }
        else if (num1 < num2) {
            System.out.println("Num 1 < num 2"); // true
        }
        else if (num2 > num3) {
            System.out.println("Num 2 > num 3"); // skipped
        }
        else {
            System.out.println("Num 2 < or == to num 3"); // skipped
        }

        System.out.println("If with logical");
        if (num1<=num2 && num1>=num3){
            System.out.println("Num 1 is < or == to num 2 AND num 1 is > or == to num 3");
        }
        else if (num1<=num2 || num1>=num3) {
            System.out.println("Num 1 is < or == to num 2 OR num 1 is > or == to num 3");
        } else {
            System.out.println("Num 1 is < or == to num 2 AND num 1 is not > or == to num 3");
        }

        System.out.println("Nested If");
        if (num1<=num2 && num1<=num3){

            System.out.println("Num 1 is < or == to num 2 AND num 1 is < or == to num 3"); // print

            if (num1<num3){
                System.out.println("Num 1 is < num 3");                // print
            }

            if (num1==num2){
                System.out.println("Num 1 is == to num 2"); // no print
            }
            else{
                System.out.println("Num 1 is < num 2"); // print
            }
        }
    }
    public static void switchStatements(){
        int num1 = 1;

        switch (num1){
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 3:
                System.out.println("Number is 3");
                break;
            default:
                System.out.println("Number is not between 1 and 3");
                break;
        }
        String menuItem = "Coca-Cola";

        switch (menuItem){
            case "Coca-cola":
                System.out.println("This is Coca-cola");
                break;
            case "Sprite":
                System.out.println("This is Sprite");
                break;
            case "Soda":
                System.out.println("This is Soda");
                break;
            default:
                System.out.println("There is no " + menuItem);
        }
    }
    public static void triangleBuilder(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 angles");
        int angle1 = scanner.nextInt();
        int angle2 = scanner.nextInt();
        int angle3 = scanner.nextInt();

        if ((angle1+angle2+angle3)==180){
            System.out.println("Triangle can be build");
        }
        else{
            System.out.println("Triangle can not be build");
        }

    }
}