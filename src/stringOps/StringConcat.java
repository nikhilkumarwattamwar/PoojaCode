package stringOps;

/*
 *  which means that once a string object is created, its content cannot be changed.
 *  If we try to change a string, Java does not modify it creates a new string object instead.
 */
public class StringConcat {

	public static void main(String[] args) {
     String g="Hello";
     String h=new String("Hello");  //new in heap
     String i=h.concat("Hi");   //new in pool HelloHi
     String j=i.intern();
     String k="HelloHi"; //same created new 
     String l = "Hel" + "lo";
     int y = 123;
     String m = String.valueOf(y); 
     String n = String.format("Value is %d", 10); 


     
     System.out.println(i==h);
     System.out.println(j==i);
     System.out.println(k==i);
     System.out.println(m);
     System.out.println(n);
	}

}
