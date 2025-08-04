package random;
/**
*IIB-block of code inside a class but outside any method or constructor, 
*and it runs every time an object is created, before the constructor.
*/
public class InstanceBlock {

	    {
	        System.out.println("Instance block executed");  // Instance block
	    }
	    
	    InstanceBlock() {
	        System.out.println("Constructor executed");     // Constructor
	    }

	    public static void main(String[] args) {
	    	InstanceBlock d = new InstanceBlock();
	    }
	}

