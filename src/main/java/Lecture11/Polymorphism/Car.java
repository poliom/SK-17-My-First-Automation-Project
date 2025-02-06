package Lecture11.Polymorphism;

public class Car extends Vehicle {
    public Car(String brand, int maxSpeed, int price, int numberOfDoors, String fuelType) {
    super(brand, maxSpeed, price);
    this.numberOfDoors = numberOfDoors;
    this.fuelType = fuelType;
    }
    public int numberOfDoors = 2;
    public String fuelType;
    public void playMusic(){
        System.out.println("Start radio");
    }
    public void stopMusic(){
        System.out.println("Stop radio");
    }

    public void stopEngineOnTrafficLight(){
        super.stopEngine();
    }

    public boolean stopEngine(){
        //this.stopEngineOnTrafficLight();
        this.playMusic();
        return false;
    }

    public void printInfo(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Max speed: "+this.maxSpeed);
        System.out.println("Price: "+this.price);
        System.out.println("Number of doors: "+this.numberOfDoors);
        System.out.println("Fuel type: "+this.fuelType);
    }
}
