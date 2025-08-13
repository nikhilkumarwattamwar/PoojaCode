package random;

public class VoidUse {

	public static void main(String[] args) {
	    System.out.println("use void in main class");
	    
	    

	}

	public void greet() {
	    System.out.println("use void in print only or in Method updates internal state	");
	}

	public int[] getNumbers() {                  //no void
	    return new int[] {1, 2, 3, 4, 5, 6};
	}

}
