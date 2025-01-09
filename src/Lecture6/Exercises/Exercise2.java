package Lecture6.Exercises;

public class Exercise2 {
    public static void main(String[] args) {
        int[][] multidim={
                {3,575,87},
                {34,657,87},
                {343,3,87},
                {46,32,57},
        };
        for (int row=0; row<multidim.length; row++){
            for(int column=0; column<multidim[row].length; column++){
                System.out.println("Element of 2-d matrix on "+(row+1)+" and column "+(column+1)+" is: "+multidim[row][column]);
            }
        }
    }
}
