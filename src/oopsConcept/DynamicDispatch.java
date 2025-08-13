package oopsConcept;
/*
 * The decision of which method to call is made at runtime, not compile time.
*/

	class PublicVehicle{
		void run() {
			System.out.println("public transport");
		}
	}
	
	class PersonalCar extends PublicVehicle{
		void run() {
			System.out.println("family transport");
		}
	}
		
		class PerosnalBike extends PublicVehicle{
			void run() {
				System.out.println("personal transport");
			}
	}
	public class DynamicDispatch {

	public static void main(String[] args) {
		PublicVehicle p= new PublicVehicle();
		p.run();
		
		PublicVehicle v=new PersonalCar();
		v.run();
		
		PublicVehicle B=new PerosnalBike();
		B.run();
		
		

	}

}
