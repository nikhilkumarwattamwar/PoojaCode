package oopsConcept;

abstract class Animal {
	abstract void sound();

	void eat() {
		System.out.println("This animal eats food.");
	}
}

class Dog extends Animal {
	void sound() {
		System.out.println("Dog barks");
	}
}

class Cat extends Animal {
	void sound() {
		System.out.println("Cat meows");
	}

}

public class AbstractionTest {
	public static void main(String[] args) {
		Animal d = new Dog();
		d.sound();
		d.eat();

		Animal c = new Cat();
		c.sound();
		c.eat();
	}
}
