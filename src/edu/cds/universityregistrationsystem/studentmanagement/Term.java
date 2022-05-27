package edu.cds.universityregistrationsystem.studentmanagement;

public enum Term {
    SPRING("Spring"), WINTER("Winter");

    private final String displayName;

    private Term(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
