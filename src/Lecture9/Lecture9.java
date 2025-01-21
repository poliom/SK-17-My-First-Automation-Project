package Lecture9;

public class Lecture9 {
    public static void main(String[] args) {
        //cakeCreation();

        //createCars();
        PrintLine print = new PrintLine();
        print.printLine();
    }

    public static void cakeCreation()
    {
        // create object
        Cake myCake = new Cake();
        // set object properties
        myCake.flavour = "vanilla";
        myCake.decoration = "Springles";
        myCake.sliceNumber = 12;
        // print object properties
        System.out.println("This is my cake: " + myCake.flavour);
        System.out.println("Is my cake vegan: " + myCake.isVegan);
        System.out.println("Decoration of cake is: " + myCake.decoration);
        System.out.println("The number of slices in my cake is: " + myCake.sliceNumber);

        System.out.println("My cake new flavour is: " + myCake.addFlavour("Mango"));
        System.out.println(myCake.flavour);

        myCake.printUsedEggs();

        // create object
        Cake secondCake = new Cake();
        System.out.println("Second cake before change the default flavour: " + secondCake.flavour);
        // set object properties
        secondCake.flavour = "Chocko-moko";
        //secondCake.decoration = "Springles";
        secondCake.isVegan = true;

        secondCake.usedEggs(0);
        secondCake.printUsedEggs();
        // print object properties
        System.out.println("This is second cake: " + secondCake.flavour);
        System.out.println("Is second cake vegan: " + secondCake.isVegan);
        System.out.println("Decoration of cake is: " + secondCake.decoration);
        System.out.println("The number of slices in second cake is: " + secondCake.sliceNumber);

        Cake myLastCake = new Cake();
        System.out.println("This is my last cake flavour: " + myLastCake.flavour);
    }

    public static void createCars(){
        Cars myFirstCar = new Cars();
        printCarsDetails(myFirstCar, "My first car");
        System.out.println("-----------------------------------");

        Cars my2Car = new Cars("Red");
        printCarsDetails(my2Car, "My 2 car");
        System.out.println("-----------------------------------");

        Cars my3Car = new Cars("Green", "Manual");
        printCarsDetails(my3Car,"My 3 car");
        System.out.println("-----------------------------------");

        Cars my4Car = new Cars("Green", "Manual", true);
        printCarsDetails(my4Car,"My 4 car");
        System.out.println("-----------------------------------");

        Cars my5Car = new Cars("Blue", "Manual", true, "BMW");
        printCarsDetails(my5Car,"My 5 car");
        System.out.println("-----------------------------------");

        Cars my6Car = new Cars("Purple", "Manual", true, "BMW", 2024);
        my6Car.isEco = false;
        printCarsDetails(my6Car,"My 6 car");
        System.out.println("-----------------------------------");

        Cars my7Car = new Cars("Purple-Green", "Manual", true, "BMW", 2025, true);
        printCarsDetails(my7Car,"My 7 car");
        System.out.println("-----------------------------------");

    }

    public static void printCarsDetails(Cars car, String objectName){
        System.out.println(objectName + " color is: " + car.getColor());
        System.out.println(objectName + " transmission is: " + car.getTransmission());
        System.out.println("Is " + objectName + " electric: " + car.getIsElectric());
        System.out.println(objectName + "brand is: " + car.getBrand());
        System.out.println("The year of " + objectName + " is: " + car.getYear());
        System.out.println("Is " + objectName + " eco friendly: " + car.isEco);
    }


}
