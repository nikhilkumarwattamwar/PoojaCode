package oopsConcept;

class Person{	
	void Sleep(){ System.out.println("Person sleeps");}
}
class Student extends Person {
	void Study() {
		System.out.println("Student studies");
	}
}
class Teacher extends Person {
	void Teach() {
		System.out.println("teacher teaches");
	}}

class Topper extends Student{
	void score() {
		System.out.println("Good Score");
	}
}
public class Inheritance {
	public static void main(String[]args) {
	Topper A=new Topper();
	Teacher T= new Teacher();
	Student S=new Student();
	S.Sleep();
	S.Study();
	T.Sleep();
	T.Teach();
	A.score();
	A.Sleep();
    A.Study();
	

}}
