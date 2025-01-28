package Lecture11.Inheritance;

public class Car extends Vehicle{
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
}
