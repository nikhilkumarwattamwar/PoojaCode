package random;

public class Final {
	
	

	final class Animal {
	    final void sound() {
	        System.out.println("Animal makes sound");
			final int MAX_USERS = 100 ;

	    }
	}

	class Dog //extends Animal {  //cannot be inherited
	    // void sound() {}        // ❌ Error: cannot override final method
		
		//MAX_USERS = 200;        // ❌ Error: cannot assign a value to final variable
	{}


}
