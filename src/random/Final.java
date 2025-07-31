package random;

final public class Final {
	
	

	final class Animal {
	    final void sound() {
	        System.out.println("Animal makes sound");
			final int MAX_USERS = 100 ;

	    }
	}

	class Dog //extends Animal {  //cannot be inherited
		
		//MAX_USERS = 200;        // cannot assign a value to final variable
	{}

}	    // void sound() {}        // cannot override final method

//public class Final{                 //outer class can not be overridden
	
