package stringOps;

import java.util.ArrayList;
import java.util.List;

public class StringOptions {
	 public static char accessCharByIndex(String s, int k) {
	      
	        return s.charAt(k);
	        
}

	 public static void insert(String s, String t, int k) {//Add Ankushrao
	      
	        StringBuilder su = new StringBuilder(s);
	        su.insert(k, t);
	        String modifiedString = su.toString();
	        System.out.println("Modified String: " + modifiedString);
	    }
	  public static  void removerao( ){
		    String m="PoojaAnkushraoBiradar";
	    String l= m.substring(0, 11) +  m.substring(14);//remove rao
	    System.out.println(l);

	    }
	  public static void removeChar(StringBuilder s, char c  ) {//char delete
	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) == c) {
	                s.deleteCharAt(i);
	                i--; // Step back after deletion
	            }
	        }
	        System.out.println(s);
	  }
	
	  public static void countChar(StringBuilder s, char c  ) {
		  int j=0;
		   for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) == c) {
	                j++;
	            }
		   }
		   System.out.println(j);
		  
	  }
	  public static void reversed(StringBuilder m) {
		  String reversed="";
		  for (int i = m.length() - 1; i >= 0; i--) {
	            reversed += m.charAt(i);
	           // System.out.println(reversed);
	  }
          System.out.println(reversed);

	  }
	  
	  public static boolean palindrome(String s) {
		  //s=s.toLowerCase().replaceAll("\\s+", "");
		  int left=0;
		  int right=s.length()-1;
		    while (left < right) {

		    if (s.charAt(left) != s.charAt(right)) {
                return false;  
            }
            left++;
            right--;}
	          return true; 
		    
	  }
	  public static void lengthwithout(String s) {
		 int j=0;
		 for(int i=0;i<s.length();i++) {
	            if (s.charAt(i) !=' ') {
	                j++;
			 
		 }
	           }
		 System.out.println(j);
	     }
	  

	 
 public static void main(String[] args) {
    String s = "PoojaBiradar";
    String t="Ankushrao";
    int k = 5;
    StringBuilder m=new StringBuilder("PoojaAnkushraoBiradar");
   
    

    System.out.println(accessCharByIndex(s, k));
    System.out.println(s.charAt(7));
    insert(s, t, k);
    removerao();
    countChar( m,'a');
    removeChar(m, 'a');
    countChar( m,'a');
    reversed(m);
    System.out.println(palindrome("MADM"));
    lengthwithout(s);


    
}
}
