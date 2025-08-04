package random;

class Animal {
	void sound() {
		System.out.println("Animal voice");
	}
}
class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("mew");
	}
}
public class OverrideMethod {
	public static void main(String[]args) {
		Animal a=new Cat();
		a.sound();
	}

}
