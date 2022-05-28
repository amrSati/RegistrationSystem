package edu.cds.universityregistrationsystem.studentmanagement;

public class RegistrationNumber {

    /** Data Fields */
    private final String registrationNumber;
    private final int year;
    private final int majorCode;
    private final int departmentCode;
    private final int studentNumber;

    /** Constructors */
    public RegistrationNumber(int year, int majorCode, int departmentCode, int studentNumber) {
        this.year = year;
        this.majorCode = majorCode;
        this.departmentCode = departmentCode;
        this.studentNumber = studentNumber;
        registrationNumber = setRegistrationNumber();
    }

    /** Methods */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    private String setRegistrationNumber() {
        return String.format("%04d%02d%02d%02d", year, majorCode, departmentCode, studentNumber);
    }
}
