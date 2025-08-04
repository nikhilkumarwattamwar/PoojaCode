package random;


class Dog{
	void sound() {
		System.out.println("dog barks");
	}
}
public class OverrideAnonymous {
	public static void main(String []args) {
		Dog d=new Dog() {
		void sound() {
			System.out.println("barking loundly");
		}
	};
	d.sound();
}
}
	 


