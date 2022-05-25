package edu.cds.registrationsystem;

public class Nationality {
	
	// Attributes
	private String nationality;
	
	// Constructor
	public Nationality() {
		nationality = null;
	}

	public Nationality(String nationality) {
		this.nationality = nationality;
	}
	
	// Methods
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public String getNationality() {
		return nationality;
	}
}
