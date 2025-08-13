package oopsConcept;
/*java8: To add new functionality to interfaces without breaking existing implementations.
 No need to override start() unless we want to change behavior
 Static methods in interfaces are not inherited by implementing classes.
You must call them using the interface name.
Define utility methods that relate to the interface but are not tied to an instance.
*/


interface flyable {
	void fly();
}

class Bird implements flyable {

	@Override
	public void fly() {
		System.out.println("Bird fly with wings");
	}

}

class Plane implements flyable {

	@Override
	public void fly() {
		System.out.println("Plane use machines to fly");
	}

}

public class Interface {
	public static void main(String[] args) {
		flyable b = new Bird();
		flyable p = new Plane();
		b.fly();
		p.fly();
	}
}
