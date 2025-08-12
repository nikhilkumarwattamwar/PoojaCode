package ExceptionHandling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RunTimeException {
    private static final Logger logger = LoggerFactory.getLogger(RunTimeException.class);
    
	public static void main(String[] args) {



		String a=null;
		try{
        	System.out.println(a);
        	}
		catch(NullPointerException e){
			logger.error("Exception occurred: ", e); //catch error
			a="here";
			System.out.println(a);//handling code	
		}
		try{
        	throw new NullPointerException("String cant be null");        	
        	}
		catch(NullPointerException e){
			logger.error("Exception occurred: ", e); //catch error
			a="there";
			System.out.println(a);//handling code	
		}
        try{
        	System.out.println(10/0);
        	}
		catch(ArithmeticException e){
			logger.error("Exception occurred: ", e); //catch error
			System.out.println(10/2);//handling code
			
		}
        try{
        	throw new ArithmeticException("Cannot divide by zero!");        	}
		catch(ArithmeticException e){
			logger.error("Exception occurred: ", e);
			System.out.println(10/2);
			}
        
			Object obj = "Hello";
			try {
				Integer num = (Integer) obj;
			} catch (ClassCastException e) {
				logger.error("Exception occurred: ", e);
				String str = (String) obj;
			}
			try {
				throw new ClassCastException("String cant be converted to int");
			} catch (ClassCastException e) {
				logger.error("Exception occurred: ", e);
				String str = (String) obj;
				System.out.println(str);
			}
			try {
				Integer num = (Integer) obj;
			} catch (ClassCastException e) {
				logger.error("Exception occurred: ", e);
				String str = (String) obj;
			}
			try {
				throw new ClassCastException("String cant be converted to int");
			} catch (ClassCastException e) {
				logger.error("Exception occurred: ", e);
				String str = (String) obj;
				System.out.println(str);
			}
			  
			
			try
			{
				throw new IllegalArgumentException("Explicit IllegalArgumentException thrown");
			}
			catch(IllegalArgumentException e)
			{
			 logger.error("Exception occurred: ", e);
			}
			
             int age=-9;
             try {
			 if (age < 0) {
		            throw new IllegalArgumentException("age must be positive");
		        }}
             catch(IllegalArgumentException e) {
    			 logger.error("Exception occurred: ", e);
		        System.out.println("age is " + age);
		        }
             
             String b = "World";

		        try {
		            System.out.println(b.charAt(10) ); 
		        } catch(StringIndexOutOfBoundsException  e) {
	    			 logger.error("Exception occurred: ", e);
		            System.out.println("catched");
		        }
		        
	
		      
	
//		IllegalStateException
//		When a method has been invoked at an illegal or inappropriate time.
//
//		NumberFormatException
//		Trying to convert a string to a numeric type but the string format is invalid.
//
//		UnsupportedOperationException
//		When an operation is not supported (often in collections).
//
//		ConcurrentModificationException
//		When a collection is modified while iterating over it in an unsupported way.
//
//		ArrayStoreException
//		Storing the wrong type of object into an array of objects.
//
//		SecurityException
//		Thrown by the security manager to indicate a security violation.
		        System.out.println("complete");
	}

}
