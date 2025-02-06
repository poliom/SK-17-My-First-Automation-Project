package Lecture9;

public class Cake {
    public Cake(){

    }
    public Cake(int sliceNumber){
        this(false, sliceNumber);
    }

    public Cake(boolean isVegan){
        this(isVegan, 0);
    }

    public Cake (boolean isVegan,int sliceNumber){
        this.isVegan = isVegan;
        this.sliceNumber = sliceNumber;
    }

    static String flavour="Vanilla";
    //String flavour="Vanilla";
    int sliceNumber;
    String decoration;
    boolean isVegan = false;

    private int numberOfEggs = 1;

    public String addFlavour(String flavour){
        this.flavour = this.flavour + " and " + flavour;
        return this.flavour;
    }

    public void usedEggs(int eggs){
        this.numberOfEggs = eggs;
    }

    public void printUsedEggs(){
        System.out.println("The number of used eggs is: " + numberOfEggs);
    }
}
