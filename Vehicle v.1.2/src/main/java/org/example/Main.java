package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Машина
        Vehicle car = new Vehicle("Toyota", "Camry", 2022, 4, 0) {
            @Override
            public void testDrive() {
                speed = 60;
            }

            @Override
            public void park() {
                speed = 0;
            }
        };

        car.testDrive();
        System.out.println("Car speed: " + car.getSpeed());

        car.park();
        System.out.println("Car speed after parking: " + car.getSpeed());

        // Мотоцикл
        Vehicle motorcycle = new Vehicle("Harley-Davidson", "Sportster", 2022, 2, 0) {
            @Override
            public void testDrive() {
                speed = 75;
            }

            @Override
            public void park() {
                speed = 0;
            }
        };

        motorcycle.testDrive();
        System.out.println("Motorcycle speed: " + motorcycle.getSpeed());

        motorcycle.park();
        System.out.println("Motorcycle speed after parking: " + motorcycle.getSpeed());
    }
}

abstract class Vehicle {
    protected String company;
    protected String model;
    protected int yearRelease;
    protected int numWheels;
    protected int speed;

    public Vehicle(String company, String model, int yearRelease, int numWheels, int speed) {
        this.company = company;
        this.model = model;
        this.yearRelease = yearRelease;
        this.numWheels = numWheels;
        this.speed = speed;
    }

    public abstract void testDrive();

    public abstract void park();

    public int getNumWheels() {
        return numWheels;
    }

    public int getSpeed() {
        return speed;
    }
}
