package oopsConcept;

class Employee {
	private int empId;
	private String empName;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int id) {
		this.empId = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String name) {
		this.empName = name;
	}
}

public class EncapPracticeEmployee {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpId(101);
		e.setEmpName("Rahul");

		System.out.println("ID: " + e.getEmpId());
		System.out.println("Name: " + e.getEmpName());
	}
}
