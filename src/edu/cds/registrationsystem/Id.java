package edu.cds.registrationsystem;

import java.time.LocalDate;

public class Id {

    /** Data fields */
    private String type;
    private String idNumber;
    private LocalDate validity;

    /** Constructor */
    public Id(String type, String idNumber, String validity) {
        this.type = type;
        this.idNumber = idNumber;
        this.validity = LocalDate.parse(validity);
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

    public String getValidity() {
        return validity.toString();
    }

    public void setValidity(String validity) {
        this.validity = LocalDate.parse(validity);
    }
}
