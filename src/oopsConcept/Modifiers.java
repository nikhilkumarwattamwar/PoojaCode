package oopsConcept;

import typesData.ModifiersAnotherPackage;

public class Modifiers {

	public void greetPublic() {
		System.out.println("Public Hello from ClassA!");
	}

	private void greetpvt() {
		System.out.println("Private Hello from ClassA!");

	}

	protected void greetPro() {
		System.out.println("Protected Hello from ClassA!");
	}

	void greetD() {
		System.out.println("Default Hello from ClassA!");
	}

	public static void main(String[] args) {
		Modifiers a = new Modifiers();
		a.greetD();
		a.greetPublic();
		a.greetpvt();
		a.greetPro();

		ModifiersAnother b = new ModifiersAnother();
		b.greetD();
		b.greetPublic();
		// b.greetpvt();
		b.greetPro();

		ModifiersAnotherPackage c = new ModifiersAnotherPackage();
		// c.greetD();
		c.greetPublic();
		// c.greetpvt();
		// c.greetPro();

	}
}
