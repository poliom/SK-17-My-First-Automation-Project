package Lecture12;

public abstract class Vehicle extends Parts{

    public Vehicle(String brand, int maxSpeed, int price){
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }
    private String brand;
    private int maxSpeed;
    public int price;
    private boolean isCarBroken = false;

    private boolean isEngineStarted = false;
    public boolean startEngine(){
        System.out.println("Start Vehicle Engine");
        this.isEngineStarted = true;
        return true;
    }
    public boolean stopEngine(){
        System.out.println("Stop Vehicle Engine");
        this.isEngineStarted = false;
        return false;
    }

    public void printEngineStatus(){
        System.out.println("Is Engine turned on: " + this.isEngineStarted);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed < 0){
            System.out.println("There is a problem, car is broken or you are truing to do illegal set");
            return;
        } else if (maxSpeed == 0) {
            System.out.println("Car is broken");
            this.isCarBroken = true;
        }
        this.maxSpeed = maxSpeed;
    }

    public void getIsCarBroken(){
        if (this.isCarBroken){
            System.out.println("Yes the car is broken");
        }
        else {
            System.out.println("No the car is ok");
        }
    }
     public abstract void drive();

    @Override
    public void typeOfBody() {
        System.out.println("Car body");
    }
}
