package Lecture11.Polymorphism;

public class Bus extends Vehicle{
    public Bus(String brand, int maxSpeed, int price, int numberOfSeats) {
        super(brand, maxSpeed, price);
        this.numberOfSeats = numberOfSeats;
    }

    int numberOfSeats;

    public void returnNumberOfSeats(){
        System.out.println("The bus has " + this.numberOfSeats + " number of seats");
    }

    @Override
    public boolean stopEngine(){
        System.out.println("Can`t stop engine due to already stopped");
        return false;
    }

    public void printInfo(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Max speed: "+this.maxSpeed);
        System.out.println("Price: "+this.price);
        System.out.println("Number of seats: " + this.numberOfSeats);
    }
}
