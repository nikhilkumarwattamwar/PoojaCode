package typesData;

public class EqualsvsDotequals {
	    public static void main(String[] args) {

	        int a = 10;
	        int b = 10;
	        System.out.println("Primitives:");
	        System.out.println("a == b: " + (a == b)); 

	        Integer x = new Integer(100);
	        Integer y = new Integer(100);
	        System.out.println("x == y: " + (x == y));          
	        System.out.println("x.equals(y): " + x.equals(y));   
	        
	        String s1 = "hello";
	        String s2 = "hello";
	        String s3 = new String("hello");
	        System.out.println("s1 == s2: " + (s1 == s2));        
	        System.out.println("s1 == s3: " + (s1 == s3));        
	        System.out.println("s1.equals(s3): " + s1.equals(s3));
       
	}  
	}

