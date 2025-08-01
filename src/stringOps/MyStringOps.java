package stringOps;

public class MyStringOps {
	/*
	 * When.intern() is called, it checks String Pool and places String if not already present.
	 */

	public static void main(String[] args) {

		String a = "Hello";           // p
		String b = "Hello";              //p
		String c = new String("Hello"); // h
		String d = a.intern(); //p
		String e = c.intern(); //p
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a == d);
		System.out.println(a == e);

	}

}
