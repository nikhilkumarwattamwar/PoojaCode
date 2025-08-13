package random;

 public class Outerclass {
	int a=10;
	
	
	class Innerclass{
		void outerclassValue() {
			System.out.println("outerclass value is "+ a);
		}
	
	}

	public static void main(String[] args) {
		Outerclass O=new Outerclass();
		Outerclass.Innerclass I=O.new Innerclass();
		I.outerclassValue();

	}

	static {
        System.out.println("Static block runs before main");
    }

}
