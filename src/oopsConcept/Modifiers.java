package oopsConcept;

import typesData.ModifiersAnotherPackage;

public class Modifiers { 
	
	public  void GreetPublic() {
	 System.out.println("Public Hello from ClassA!");
	        }
	
	private void Greetpvt() {
        System.out.println("Private Hello from ClassA!");
       
    }
	protected void GreetPro() {
        System.out.println("Protected Hello from ClassA!");
	}
	 
	void GreetD() {
        System.out.println("Default Hello from ClassA!");
	}	
	public static void main(String[]args) {
		 Modifiers A = new Modifiers();
		 A.GreetD();
		 A.GreetPublic();
		 A.Greetpvt();
		 A.GreetPro();
		 
		 ModifiersAnother B = new ModifiersAnother();
		 B.GreetD();
		 B.GreetPublic();
		// B.Greetpvt();
		 B.GreetPro();
		 
		 ModifiersAnotherPackage C = new ModifiersAnotherPackage();
		 //C.GreetD();
		 C.GreetPublic();
		 //C.Greetpvt();
		 //C.GreetPro();
		 

	}
}



