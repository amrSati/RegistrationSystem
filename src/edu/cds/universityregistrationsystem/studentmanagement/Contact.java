package edu.cds.universityregistrationsystem.studentmanagement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contact {

    /** Data fields */
    private String email;
    private String homeNumber;
    private String mobileNumber;

    // email validity pattern
    public static final Pattern VALID_EMAIL =
            Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    /** Constructor */
    public Contact(String email, String homeNumber, String mobileNumber) {
        this.email = validate(email) ? email : null;
        this.homeNumber = homeNumber;
        this.mobileNumber = mobileNumber;
    }

    /** Methods */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = validate(email) ? email : null;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    // Validates an email
    private boolean validate(String email) {
        Matcher matcher = VALID_EMAIL.matcher(email);
        return matcher.find();
    }
}
