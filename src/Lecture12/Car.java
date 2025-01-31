package Lecture12;

public class Car extends Vehicle implements CarIntirio {
    public Car(String brand, int maxSpeed, int price, int numberOfDoors, String fuelType) {
        super(brand, maxSpeed, price);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }
    public int numberOfDoors = 2;
    private String fuelType;
    public void playMusic(){
        System.out.println("Start radio");
    }
    public void stopMusic(){
        System.out.println("Stop radio");
    }

    public void stopEngineOnTrafficLight(){
        super.stopEngine();
    }

    public void chipTuning() {
        System.out.println("Max speed is increase with 20");
        super.setMaxSpeed(super.getMaxSpeed()+20);
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void drive() {
        System.out.println("Use pedals and wheal to drive the car");
    }

    @Override
    public String engineHead() {
        return "V8";
    }

    @Override
    public void speedMeter() {
        System.out.println("Current speed is metered in kilometers per hours");
    }

    @Override
    public void waterTemperatureMeter() {
        System.out.println("Water of the engine cooler in celsius");
    }

    @Override
    public void typeOfGears() {
        System.out.println("Manual");
    }

    @Override
    public void radioType() {
        System.out.println("CD");
    }

    @Override
    public void seats() {
        System.out.println("Leather seats");
    }


    //public boolean testEngine = this.isEngineStarted;
}
