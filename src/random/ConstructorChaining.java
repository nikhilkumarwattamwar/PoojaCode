package random;
class demo{
	 //super() - calls immediate parent class constructor
	 //super() - INHERITANCE is mandatory
	 //super() - first statement inside constructor
	 //super() and this() cannot be written in same constructor
	 demo(){
	  this(7);
	  System.out.println("this is a default constructor of demo class");
	 }
	 demo(int c){
	  System.out.println("This is integer constuctor of demo class");
	 }
	}
	public class ConstructorChaining {
	 //Calling a constructor from another constructor
	 //this() and super()
	 //this should always be first statement inside constructor
	 //Constructor Overloading
	 ConstructorChaining(){
	  this(5);
	  System.out.println("This is Default Construtor");
	 }
	 ConstructorChaining(int i){
	  this("Azhar Techno Coder");
	  System.out.println("This is int type Construtor");  
	 }
	 ConstructorChaining(String s){
	  super();
	  System.out.println("String Constructor");
	 }
	 public static void main(String[] args) {
	  ConstructorChaining rv = new ConstructorChaining();
	  demo d=new demo();
	 }
	}


