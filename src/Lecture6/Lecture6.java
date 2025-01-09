package Lecture6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Lecture6 {
    public static void main(String[] args) {
        //arrayDemo();
        //multidimensionalArrayDemo();
        //arrayListDemo();
        //outSideOfBoundErrorDemo();
        //linkedListDemo();
        //queueDemo();
        stackDemo();
    }
    public static void arrayDemo(){
        int[] numberArray = new int[6];
        int[] arrayNumbers = {5,4,3,27,7};

        System.out.println("Array length 1: "+numberArray.length);
        System.out.println("Array length 2: "+arrayNumbers.length);
        // empty array
        for(int number : numberArray){
            System.out.println("Array 1 current number is: " + number);
        }

        numberArray[0] = 6;
        numberArray[1] = 5;
        numberArray[2] = 4;
        numberArray[3] = 3;
        numberArray[4] = 2;
        numberArray[5] = 1;
        // array with values
        for(int number : numberArray){
            System.out.println("Array 1 current number is: " + number);
        }

        String[] stringArray = new String[3];
        for(String text:stringArray){
            System.out.println("Elements of String array: " + text);
        }
        stringArray[1] = "test text bla";
        for(String text:stringArray){
            System.out.println("Elements of String array: " + text);
        }
    }
    public static void multidimensionalArrayDemo(){
        int[][] multiArray = {
                {3,54,45, 35},
                {34,53,64, 5},
                {24,63,234, 75}
        };
        for(int row =0 ; row<multiArray.length; row++){
            for (int culm=0; culm<multiArray[row].length;culm++){
                System.out.println("Value of row "+row+" and culm "+culm+" is: "+multiArray[row][culm]);
            }
        }

        System.out.println("Custom value out of dim array with row 2 and culm 3 is: "+multiArray[2][3]);
    }
    public static void arrayListDemo(){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        // add elements
        arrayList.add(34);
        arrayList.add(36);
        arrayList.add(35);
        System.out.println("ArrayList values: "+arrayList);
        // sort elements
        arrayList.sort(Integer::compareTo);
        System.out.println("ArrayList sorted values: "+arrayList);
        // remove element
        arrayList.remove(1);
        System.out.println("ArrayList after remove element on index 1: "+arrayList);
        // update element value
        arrayList.set(1, 96);
        System.out.println("ArrayList after set element on index 1: "+arrayList);
        // check size
        arrayList.add(56);
        arrayList.add(2365);
        arrayList.add(2);
        System.out.println("ArrayList size is: "+arrayList.size());
        // access element
        System.out.println("ArrayList value on index 3: "+arrayList.get(3));
        // outside of bound -> error not allowed operation
        //System.out.println("ArrayList value on index 5: "+arrayList.get(5));
        for (int number:arrayList){
            System.out.println("Current number is: "+number);
        }
    }
    public static void outSideOfBoundErrorDemo(){
        int[] numbers = {4,3,6};
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(7);
        arrayList.add(2);
        arrayList.add(9);
        for (int i = 0; i<numbers.length; i++){
            System.out.println("Number: "+ numbers[i]);
        }
        for (int i = 0; i<=arrayList.size(); i++){
            System.out.println("Number: "+ arrayList.get(i));
        }
    }
    public static void linkedListDemo(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(235);
        linkedList.add(23);
        System.out.println(linkedList);
        //add on specific position
        linkedList.add(1,543);
        System.out.println(linkedList);
        //add last element
        linkedList.addLast(3542);
        System.out.println(linkedList);
        //Add first element
        linkedList.addFirst(3);
        System.out.println(linkedList);
        //remove element
        linkedList.remove();
        System.out.println(linkedList);
        //remove element on index
        linkedList.remove(1);
        System.out.println(linkedList);
    }
    public static void queueDemo(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(35);
        queue.add(65);
        queue.add(8798);
        queue.add(96);
        System.out.println(queue);
        System.out.println("Numbers of elements: "+ queue.size());

        queue.remove();
        System.out.println(queue);

        int numberOfElementsInQueue = queue.size();
        for (int i=0; i<numberOfElementsInQueue; i++){
            System.out.println("Remove element: " + queue.poll());
            System.out.println(queue);
        }
        System.out.println(queue);

    }
    public static void stackDemo(){
        Stack<String> stringStack= new Stack<>();
        stringStack.push("Book 1");
        stringStack.push("Book 2");
        stringStack.push("Book 3");
        stringStack.push("Book 4");
        System.out.println("Elements in stack: "+ stringStack);
        System.out.println("Get first element: "+ stringStack.getFirst());
        System.out.println("Elements in stack: "+ stringStack);
        System.out.println("Get last element: "+ stringStack.getLast());
        System.out.println("Elements in stack: "+ stringStack);
        System.out.println("Remove element: "+stringStack.pop());
        System.out.println("Elements in stack: "+ stringStack);
        System.out.println("Remove element: "+stringStack.remove(1));
        System.out.println("Elements in stack: "+ stringStack);
    }
}
