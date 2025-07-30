package random;

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


