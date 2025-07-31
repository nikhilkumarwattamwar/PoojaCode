package oopsConcept;
/*
 * Happens at compile-time.
 * same name diff arguments
Improves code readability and reusability.
 */

public class OverloadingMethod {
	void print(int i) {
		System.out.println("number="+i);
	}
	void print (String text) {
		System.out.println("String="+text);
	}
	
	void print(char c) {
		System.out.println("character="+c);
	}

	public static void main(String[] args) {
		OverloadingMethod m=new OverloadingMethod();
		m.print(90);
		m.print("marks");
		m.print('A');
	}

}
