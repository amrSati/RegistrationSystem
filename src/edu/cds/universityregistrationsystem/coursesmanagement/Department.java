package edu.cds.universityregistrationsystem.coursesmanagement;

/**
 *  Organizes the department and it's code
 */
public class Department {

	// Attributes
	private String department;
	private int departmentCode;
	
	// Constructors
	public Department() {
		department = null;
		departmentCode = 0;
	}

	public Department(String department, int departmentCode) {
		this.department = department;
		this.departmentCode = departmentCode;
	}

	// Methods
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartmentCode(int departmentCode) {
		this.departmentCode = departmentCode;
	}
	
	public int getDepartmentCode() {
		return departmentCode;
	}
}
