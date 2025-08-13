package oopsConcept;
/**
Abstraction means hiding the internal details and showing only the essential features of an object.
*/

public class Abstraction {

	static abstract class Tv {
		abstract void turnOn();

		abstract void turnOff();

		abstract void channelChange();
	}

	 static class Remote extends Tv {
		public void turnOn() {
			System.out.println("TV ON");
		}

		public void turnOff() {
			System.out.println("TV OFF");
		}

		public void channelChange() {
			System.out.println("TV Channel Changed");
		}
	}

	public static void main(String[] args) {
		
		Tv t = new Remote();
		t.turnOn();
		t.turnOff();
		t.channelChange();
	}
}
