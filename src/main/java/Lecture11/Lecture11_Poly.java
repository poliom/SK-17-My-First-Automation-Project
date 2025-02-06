package Lecture11;

import Lecture11.Polymorphism.Car;
import Lecture11.Polymorphism.Bus;
import Lecture11.Polymorphism.Vehicle;

public class Lecture11_Poly {
    public static void main(String[] args) {
        Car audi = new Car("Audi", 180, 5000, 5, "Gasoline");
        audi.isEngineStarted = audi.startEngine();
        audi.playMusic();

        Car bmw = new Car("BMW", 150, 3000, 5, "Diesel");
        bmw.isEngineStarted = bmw.startEngine();
        bmw.stopMusic();

        System.out.println("The fuel type of Audi is: " + audi.fuelType);
        System.out.println("Is Audi engine started: " + audi.isEngineStarted);
        System.out.println("The brand of BMW is: " + bmw.brand);
        System.out.println("Is BMW engine started: " + bmw.isEngineStarted);
        bmw.stopEngine();
        System.out.println("Is BMW engine started: " + bmw.isEngineStarted);

        Vehicle baseCar = new Vehicle("Lada", 120, 1500);
        baseCar.isEngineStarted = baseCar.startEngine();
        System.out.println("Is base car engine started: " + baseCar.isEngineStarted);
        System.out.println("Base car price is: " + baseCar.price);

        Bus myBus = new Bus("WV", 100, 3600, 9);
        System.out.println("My bus brand is: "+myBus.brand);
        myBus.returnNumberOfSeats();
        System.out.println("Is my bus engine started: " +myBus.isEngineStarted);
        System.out.println("My bus engine state: "+ myBus.stopEngine());

        Vehicle tesla = new Car("Tesla", 190, 100000,5,"Electric");
        Vehicle partner = new Bus("Pejo", 140, 25000, 7);
        Vehicle testCar = new Vehicle("Vidko", 250, 152);

//        System.out.println("Tesla info:");
//        System.out.println("Brand: "+tesla.brand);
//        System.out.println("Max speed: "+tesla.maxSpeed);
//        System.out.println("Price: "+tesla.price);
//
//        System.out.println("Partner info:");
//        System.out.println("Brand: "+partner.brand);
//        System.out.println("Max speed: "+partner.maxSpeed);
//        System.out.println("Price: "+partner.price);
        tesla.printInfo();
        partner.printInfo();
        testCar.printInfo();
    }
}
