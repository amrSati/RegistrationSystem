package edu.cds.registrationsystem;

public class Department {

	// Attributes
	private String department;
	private int code;
	
	// Constructors
	public Department() {
		department = null;
		code = 0;
	}

	public Department(String department, int code) {
		this.department = department;
		this.code = code;
	}

	// Methods
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
}
