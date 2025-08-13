package oopsConcept;

class Pen{
	String color;
	String type;
	
	void write() {
		System.out.println("write");
	}
	void printcolor() {
		System.out.println(this.color);
	}
	void printtype() {
		System.out.println(this.type);
	}
}

public class Practice {

	public static void main(String[] args) {
		Pen pen1=new Pen();
		pen1.color="blue";
		pen1.type="gel";
		
		Pen pen2=new Pen();
		pen2.color="Black";
		pen2.type="ball";
		
		pen1.printcolor();
		pen1.printtype();
		pen1.write();
		pen2.printcolor();
		pen2.printtype();
		pen2.write();
		
		

	}

}
