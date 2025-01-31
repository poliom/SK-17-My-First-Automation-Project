package Lecture12;

public class Bus implements Dashboard{
    @Override
    public void speedMeter() {
        System.out.println("Bus current speed is metered in mile per hours");
    }

    @Override
    public void waterTemperatureMeter() {
        System.out.println("Water of the engine cooler in kelvins");
    }
}
