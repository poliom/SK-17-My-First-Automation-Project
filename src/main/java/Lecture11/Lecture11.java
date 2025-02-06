package Lecture11;

import Lecture11.Inheritance.Car;
import Lecture11.Inheritance.Vehicle;

public class Lecture11 {
    public static void main(String[] args) {
        Car audi = new Car("Audi", 180, 5000, 5, "Gasoline");
        audi.isEngineStarted = audi.startEngine();
        //audi.fuelType = "Gasoline";
        audi.playMusic();

        Car bmw = new Car("BMW", 150, 3000, 5, "Diesel");
        bmw.isEngineStarted = bmw.startEngine();
        bmw.stopMusic();
        //bmw.brand = "BWM";

        System.out.println("The fuel type of Audi is: " + audi.fuelType);
        System.out.println("Is Audi engine started: " + audi.isEngineStarted);
        System.out.println("The brand of BMW is: " + bmw.brand);
        System.out.println("Is BMW engine started: " + bmw.isEngineStarted);
        bmw.stopEngine();
        System.out.println("Is BMW engine started: " + bmw.isEngineStarted);

        System.out.println("TrafficLight");
        bmw.isEngineStarted = bmw.startEngine();
        System.out.println("Is BMW engine started: " + bmw.isEngineStarted);
        bmw.stopEngineOnTrafficLight();
        System.out.println("Is BMW engine started: " + bmw.isEngineStarted);

        Vehicle baseCar = new Vehicle("Lada", 120, 1500);
        baseCar.isEngineStarted = baseCar.startEngine();
        //baseCar.price = 1500;
        System.out.println("Is base car engine started: " + baseCar.isEngineStarted);
        System.out.println("Base car price is: " + baseCar.price);
    }
}
