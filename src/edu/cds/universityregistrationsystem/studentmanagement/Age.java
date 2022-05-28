package edu.cds.universityregistrationsystem.studentmanagement;

import java.time.LocalDate;
import java.time.Period;

public class Age {

    /** Data fields */
    private int age;
    private LocalDate dateOfBirth;

    /** Constructor */
    public Age(String dob) {
        // Input in YYYY-MM-DD format
        dateOfBirth = LocalDate.parse(dob);

        calculateAge();
    }

    /** Methods */
    public int getAge() {
        return age;
    }

    public String getDateOfBirth() {
        return dateOfBirth.toString();
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = LocalDate.parse(dateOfBirth);
        calculateAge();
    }

    /** Calculate age based on DOB */
    private void calculateAge() {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Compute age
        if (dateOfBirth != null)
            age = Period.between(dateOfBirth, currentDate).getYears();
        else
            age = 0;
    }
}
