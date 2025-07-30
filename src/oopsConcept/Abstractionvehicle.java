package oopsConcept;

abstract class Vehicle {
    abstract void start();
    abstract void stop();
}

class Car extends Vehicle {
    public void start() {System.out.println("Car starts with key");  }
    public void stop() {System.out.println("Car stops with brake");}
}
class Bike extends Vehicle {
    public void start() {System.out.println("Bike starts with button"); }
    public void stop() {System.out.println("Bike stops with hand brake"); }
}
public class Abstractionvehicle {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.start();
        v1.stop();

        Vehicle v2 = new Bike();
        v2.start();
        v2.stop();
    }
}

