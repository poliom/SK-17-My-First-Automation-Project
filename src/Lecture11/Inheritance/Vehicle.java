package Lecture11.Inheritance;

public class Vehicle {

    public Vehicle(String brand, int maxSpeed, int price){
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }
    public String brand;
    public int maxSpeed;
    public int price;

    public boolean isEngineStarted = false;
    public boolean startEngine(){
        System.out.println("Start Vehicle Engine");
        //this.isEngineStarted = true;
        return true;
    }
    public boolean stopEngine(){
        System.out.println("Stop Vehicle Engine");
        this.isEngineStarted = false;
        return false;
    }
}
