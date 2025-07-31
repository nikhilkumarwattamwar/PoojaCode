package random;

/**
 * super() - calls immediate parent class constructor. INHERITANCE is mandatory
 * first statement inside constructor super() and this() cannot be written in
 * same constructor
 */
class Demo {

	Demo() {
		this(7);
		System.out.println("this is a default constructor of demo class");
	}

	Demo(int c) {
		System.out.println("This is integer constuctor of demo class");
	}
}

/**
 * Calling a constructor from another constructor Constructor Overloading
 */
public class ConstructorChaining {

	ConstructorChaining() {
		this(5);
		System.out.println("This is Default Construtor");
	}

	ConstructorChaining(int i) {
		this("String");
		System.out.println("This is int type Construtor");
	}

	ConstructorChaining(String s) {
		super();
		System.out.println("String Constructor");
	}

	public static void main(String[] args) {
		ConstructorChaining c = new ConstructorChaining();
		Demo d = new Demo();
	}
}
