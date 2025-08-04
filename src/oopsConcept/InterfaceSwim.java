package oopsConcept;


	interface Swim{
	void abovewater();
	void inwater();
	}
	
	class Swimmer implements Swim {

		@Override
		public void abovewater() {
    System.out.println("boat floats");			
		}

		@Override
		public void inwater() {
     System.out.println("fish swims");			
		}
		
	}

	public class InterfaceSwim {

	public static void main(String[] args) {
     Swimmer s=new Swimmer();
     s.abovewater();
     s.inwater();

	}

}

