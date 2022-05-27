package edu.cds.universityregistrationsystem.studentmanagement;

public enum Gender {

    MALE("Male"), FEMALE("Female"), PREFER_NOT_TO_SAY("PreferNotToSay");

    private final String displayName;

    /** Constructs gender */
    private Gender(String displayName) {
        this.displayName = displayName;
    }

    /** Gender getter */
    public String getDisplayName() {
        return displayName;
    }
}
