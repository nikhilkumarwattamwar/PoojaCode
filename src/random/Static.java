package random;

public class Static {
	static String c="myschool"; //sharedin all class

	class Example {
	    static {
	        System.out.println("Static block executed"); 
	    }
	    
	    public static void main(String[] args) {
	        System.out.println(c); 

	    }
	    
	}}


