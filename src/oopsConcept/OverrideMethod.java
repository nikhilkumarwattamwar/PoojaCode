package oopsConcept;

/*
 * Happens at run-time.
Requires inheritance.
The method must have the same name, return type, and parameters.
 */

class Animall {
	void sound() {
		System.out.println("Animal voice");
	}
}
class Catt extends Animall{
	//@Override
	void sound() {
		System.out.println("mew");
	}
}
public class OverrideMethod {
	public static void main(String[]args) {
		Animall a=new Catt();
		a.sound();
	}

}
