package Lecture5;

public class Lecture5 {
    public static void main(String[] args) {
        //forLoop();
        //nestedForLoop();
        //whileLoop();
        doWhileLoop();
        //forEachLoop();
        //continueStatement();
        //breakStatementWhileLoop();
        //breakStatementDoWhileLoop();
    }
    public static void forLoop(){
        System.out.println("First For");
        for (int i =0; i<=8; i++){
            System.out.println("Number is: " + i);
        }
        System.out.println("Second For");
        for (int i =0; i<=8; ++i){
            System.out.println("Number is: " + i);
        }
        System.out.println("Infinite For");
        for (int i =0; i<=8; ++i){
            i=7;
            System.out.println("Number is: " + i);
            if (i==7){
                break;
            }
        }
    }
    public static void nestedForLoop(){
        for (int row=0; row<=10; row++){
            System.out.println("This is row: " + row);
            for (int column=0; column<=5; column++){
                System.out.println("This is column: "+column);
            }
        }
    }
    public static void whileLoop(){
        int num = 5;
        while ((num < 10)){
            //num++;
            System.out.println(num);
            num++;
        }
    }
    public static void doWhileLoop(){
        int num = 5;
        do {
            num++;
            System.out.println(num);
            num++;
        }while (num>10);

        // showcase counter control
        int count = 0;
        int numInc= 1;
        do {
            numInc++;
            System.out.println("Our number is with value + 1 and now is: "+ numInc);
            count++;
        }while (count<10 && numInc<14);
    }
    public static void forEachLoop(){
        int[] num= {2,45,24,65};
        for(int item: num){
            System.out.println(item);
            if (item != 24){
                System.out.println("This is my number: " + item);
            }
        }

        String[] names = {"Eli", "Vidko", "Misho", "Vasko","Planka", "Edi","Slav"};
        for (String name: names){
            System.out.println("My name is " + name);
        }
    }

    public static void continueStatement(){
        for (int i=7; i<10; i++){
            System.out.println("Number is: "+ i);
            System.out.println("This code is show always");
            if (i>7){
                System.out.println("Number is bigger than 7");
                continue;
            }
            if (i<=10){
                System.out.println("Number is less or = to 10");
            }
            System.out.println("Number is less or = to 8");
        }
        System.out.println("Next is WhileLoop");
        int y = 5;
        while (y<11){
            y++;
            System.out.println("Number is: "+ y);
            System.out.println("This code is show always");
            if (y<7){
                System.out.println("Number is less to 7");
                continue;
            }
            if (y>9){
                System.out.println("Number is bigger than 9");
                continue;
            }
            System.out.println("Number is = to 7 or 8 or 9");
        }
    }
    public static void breakStatementWhileLoop(){
        int y = 5;
        while (y<11){
            y++;
            System.out.println("Number is: "+ y);
            System.out.println("This code is show always");
            if (y==7){
                System.out.println("Number is == to 7");
                break;
            }
            if (y<9){
                System.out.println("Number is less than 9");
            }
        }
        System.out.println("End code");
    }
    public static void breakStatementDoWhileLoop(){
        int y = 5;
        do{
            System.out.println("Number is: "+ y);
            System.out.println("This code is show always");
            if (y==7){
                System.out.println("Number is == to 7");
                break;
            }
            if (y<9){
                System.out.println("Number is less than 9");
            }
            y++;
        }while (y<11);
        System.out.println("End code");
    }
}
