package oopsConcept;

/*
 * One class contains another class as a field and uses its functionality.
 */

public class Composition {
	class Engine {
	    void start() {
	        System.out.println("Engine starts");
	    }
	}

	class Car {
	     Engine e = new Engine();

	    void startCar() {
	        e.start(); 
	        System.out.println("Car is running");
	    }
	}


}
