package stringOps;
/*StringBuffer is a peer class of String, 
 * it is mutable in nature and it is thread safe class , 
 * we can use it when we have multi threaded environment and shared object of string buffer
 */


public class StringBufferPractice {

	public static void main(String[] args) {
		StringBuffer p=new StringBuffer("World");
		StringBuilder q = new StringBuilder("Hello");
		p.append(q);
		System.out.println(p);
      	String s = p.toString();
      	String r="WorldHello";
      	System.out.println(s);
      	
      	System.out.println(s==r);



	}

}
