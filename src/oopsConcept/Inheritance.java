package oopsConcept;

class Person {
	void sleep() {
		System.out.println("Person sleeps");
	}
}

class Students extends Person {
	void study() {
		System.out.println("Student studies");
	}
}

class Teacher extends Person {
	void teach() {
		System.out.println("teacher teaches");
	}
}

class Topper extends Students {
	void score() {
		System.out.println("Good Score");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Topper A = new Topper();
		Teacher T = new Teacher();
		Students S = new Students();
		S.sleep();
		S.study();
		T.sleep();
		T.teach();
		A.score();
		A.sleep();
		A.study();

	}
}
