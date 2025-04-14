package org.example;
public class Main04 {
    public static void main(String[] args) {
        Provider boeing = new Provider("Boeing", "USA");
        Provider toyota = new Provider("Toyota", "Japan");
        Provider martin = new Provider("Martin", "Vietnam");

        Plane plane = new Plane("Plane", boeing, "Jet Fuel");
        Car car = new Car("Car", toyota, "Gasoline");
        Bicycle bicycle = new Bicycle("Bicycle", martin);

        plane.start();
        plane.takeOff();
        System.out.println("Plane velocity: " + plane.velocity() + " km/h");
        plane.landing();

        car.start();
        System.out.println("Car velocity: " + car.velocity() + " km/h");

        bicycle.start();
        System.out.println("Bicycle velocity: " + bicycle.velocity() + " km/h");
    }
}

// Lớp Provider
class Provider {
    private String providerName;
    private String countryName;

    public Provider(String providerName, String countryName) {
        this.providerName = providerName;
        this.countryName = countryName;
    }

    public String getProviderName() {
        return providerName;
    }

    public String getCountryName() {
        return countryName;
    }
}

// Lớp trừu tượng Vehicle
abstract class Vehicle {
    protected String vehicleType;
    protected Provider provider;

    public Vehicle(String vehicleType, Provider provider) {
        this.vehicleType = vehicleType;
        this.provider = provider;
    }

    public void start() {
        System.out.println(vehicleType + " is starting.");
    }

    public void accelerate() {
        System.out.println(vehicleType + " is accelerating.");
    }

    public void stop() {
        System.out.println(vehicleType + " has stopped.");
    }

    public abstract int velocity();
}

// Lớp Plane kế thừa Vehicle
class Plane extends Vehicle {
    private String fuel;

    public Plane(String vehicleType, Provider provider, String fuel) {
        super(vehicleType, provider);
        this.fuel = fuel;
    }

    public void takeOff() {
        System.out.println(vehicleType + " is taking off.");
    }

    public void landing() {
        System.out.println(vehicleType + " is landing.");
    }

    @Override
    public int velocity() {
        return 900;
    }
}

// Lớp Car kế thừa Vehicle
class Car extends Vehicle {
    private String fuel;

    public Car(String vehicleType, Provider provider, String fuel) {
        super(vehicleType, provider);
        this.fuel = fuel;
    }

    @Override
    public int velocity() {
        return 120;
    }
}

// Lớp Bicycle kế thừa Vehicle
class Bicycle extends Vehicle {
    public Bicycle(String vehicleType, Provider provider) {
        super(vehicleType, provider);
    }

    @Override
    public int velocity() {
        return 30;
    }
}

