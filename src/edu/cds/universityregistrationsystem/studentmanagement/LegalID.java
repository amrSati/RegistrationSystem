package edu.cds.universityregistrationsystem.studentmanagement;

import java.time.LocalDate;

public class LegalID {

    /** Data fields */
    private String type;
    private String idNumber;
    private LocalDate expireDate;

    /** Constructor */
    public LegalID(String type, String idNumber, String expireDate) {
        this.type = type;
        this.idNumber = idNumber;
        this.expireDate = LocalDate.parse(expireDate);
    }

    /** Methods */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getExpireDate() {
        return expireDate.toString();
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = LocalDate.parse(expireDate);
    }
}
