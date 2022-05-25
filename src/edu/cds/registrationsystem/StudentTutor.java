package edu.cds.registrationsystem;

public class StudentTutor{
	
	// Attributes
	private Name name;
	private int code;
	
	// Constructor
	public StudentTutor () {
		name = null;
		code = 0;
	}
	
	public StudentTutor(Name name, int code) {
		this.name = name;
		this.code = code;
	}
	
	// Methods
	public void setName(Name name) {
		this.name = name;
	}
	
	public Name getName() {
		return name;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
}
