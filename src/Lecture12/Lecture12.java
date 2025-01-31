package Lecture12;

public class Lecture12 {
    public static void main(String[] args) {
        Car r4 = new Car("Audi", 180, 5000, 5, "Gasoline");
        //audi.isEngineStarted = audi.startEngine();
        r4.startEngine();
        r4.printEngineStatus();
        r4.playMusic();
        r4.stopEngine();
        System.out.println("Max speed of Audi R4 is: " + r4.getMaxSpeed());
        r4.chipTuning();
        System.out.println("Max speed of Audi R4 after tuning is: " + r4.getMaxSpeed());
        r4.getIsCarBroken();
        r4.setMaxSpeed(0);
        System.out.println("Max speed of Audi R4 after tuning is: " + r4.getMaxSpeed());
        r4.getIsCarBroken();
        System.out.println("Fuel type of Audi R4 is: " + r4.getFuelType());
        r4.setFuelType("Diesel");
        System.out.println("Fuel type of Audi R4 is: " + r4.getFuelType());
        r4.drive();
        r4.waterTemperatureMeter();
        r4.speedMeter();

        Motor bober = new Motor("Harly", 300, 500000);
        bober.drive();

        Bus myBus = new Bus();
        myBus.speedMeter();
        myBus.waterTemperatureMeter();
    }
}
