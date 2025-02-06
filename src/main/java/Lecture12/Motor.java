package Lecture12;

public class Motor extends Vehicle{
    public Motor(String brand, int maxSpeed, int price) {
        super(brand, maxSpeed, price);
    }

    @Override
    public void drive() {
        System.out.println("Use handles to drive the motor.");
    }

    @Override
    public void typeOfBody() {
        System.out.println("Motor body");
    }

    @Override
    public String engineHead() {
        return "V2";
    }
}
