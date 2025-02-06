package Lecture13;

public class Lecture13 {
    public static void main(String[] args) {
        int numberOfRows = 30;
        for (int i = 0; i<numberOfRows; i++){
            int row = i+1;
            int numberOfSpaces = numberOfRows-(row);
            String spaces = createPrintOfNumberOfSymbols(' ', numberOfSpaces);

            String stars;
            if (i==0){
                stars = "*";
            }
            else {
                int numberOfStars = (numberOfRows+i)-numberOfSpaces;
                stars = createPrintOfNumberOfSymbols('*', numberOfStars);
            }

            System.out.println(spaces+stars);
        }
    }
    private static String createPrintOfNumberOfSymbols(char symbol, int count){
        String toReturn = "";
        for (int j =0; j<count;j++){
            toReturn = toReturn + symbol;
        }
        return toReturn;
    }
}
