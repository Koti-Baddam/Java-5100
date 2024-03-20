package edu.neu.mgen;
abstract class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayType();
}
class Car extends Vehicle {
    public Car(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void displayType() {
        System.out.println("I am a Car made by " + getMake() + ".");
    }
}
class Motorbike extends Vehicle {
    public Motorbike(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void displayType() {
        System.out.println("I am a Motorbike made by " + getMake() + ".");
    }
}
class Aircraft extends Vehicle {
    public Aircraft(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void displayType() {
        System.out.println("I am an Aircraft made by " + getMake() + ".");
    }
}
class Ship extends Vehicle {
    public Ship(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void displayType() {
        System.out.println("I am a Ship made by " + getMake() + ".");
    }
}
public class VehicleProgram {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Corolla", 2020);
        Vehicle motorbike = new Motorbike("Harley-Davidson", "Street 750", 2019);
        Vehicle aircraft = new Aircraft("Boeing", "747", 2015);
        Vehicle ship = new Ship("Royal Caribbean", "Symphony of the Seas", 2018);

        car.displayType();
        motorbike.displayType();
        aircraft.displayType();
        ship.displayType();
    }
}