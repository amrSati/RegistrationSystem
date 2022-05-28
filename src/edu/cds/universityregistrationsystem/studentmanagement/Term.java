package edu.cds.universityregistrationsystem.studentmanagement;

/**
 *  Enum of the educational year terms,
 *
 *  The majority of colleges worldwide operate on two 15-week semesters per year; one in the fall and one in the spring.
 *  and extra summer course.
 *
 */
public enum Term {
    SPRING("Spring"), FALL("Fall"), SUMMER("Summer");

    private final String displayName;

    private Term(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
