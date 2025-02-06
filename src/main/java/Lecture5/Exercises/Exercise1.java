package Lecture5.Exercises;

public class Exercise1 {

    public static void main(String[] args) {
        //forExercise();
        foreachExercise();
    }
    public static void forExercise(){
        int[] numbers = {2,23,512,26,845,97};

        int biggestNumber=0;

        for(int i=0;i<numbers.length; i++){
            System.out.println("Current number is: "+numbers[i]);
            if (i==0) {
                System.out.println("One time only: " + numbers[i]);
                biggestNumber = numbers[i];
                continue;
            }
            if (biggestNumber < numbers[i]){
                System.out.println("Compare, biggestNumber: "+biggestNumber+"; currentNumber: "+numbers[i]);
                biggestNumber=numbers[i];
            }
        }
        System.out.println(biggestNumber);
    }
    public static void foreachExercise(){
        int[] numbers = {2,23,512,26,845,97};

        int biggestNumber=numbers[0];

        for(int number:numbers){
            System.out.println("Current biggest number is: "+biggestNumber);
            System.out.println("Current number is: "+number);
            if (biggestNumber < number){
                System.out.println("Compare, biggestNumber: "+biggestNumber+"; currentNumber: "+number);
                biggestNumber=number;
            }
        }
        System.out.println(biggestNumber);
    }
}
