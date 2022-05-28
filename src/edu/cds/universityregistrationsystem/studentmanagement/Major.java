package edu.cds.universityregistrationsystem.studentmanagement;

public class Major {

    /** Data fields */
    private String major;
    private int majorCode;

    /** Constructor */
    public Major(String major, int majorCode) {
        this.major = major;
        this.majorCode = majorCode;
    }

    /** Methods */
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getMajorCode() {
        return majorCode;
    }

    public void setMajorCode(int majorCode) {
        this.majorCode = majorCode;
    }
}
