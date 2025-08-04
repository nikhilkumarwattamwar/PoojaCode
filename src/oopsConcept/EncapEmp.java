package oopsConcept;



public class EncapEmp {

	public static double getWage() {
        int basesalary = 1000;
		int overtime = 100;
		int time = 5;
		return basesalary + (overtime * time);
	}
	public static void main(String[]args) {
		EncapEmp e=new EncapEmp();
		System.out.println(	getWage());
	}
}
