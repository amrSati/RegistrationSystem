package edu.cds.universityregistrationsystem.studentmanagement;

/**
 *  Stores the first enrolment details
 */
public class Enrolment {

    /** Data of first enrolment */
    private Level level;
    private Term term;
    private String year;
    private int creditHrsFinished;

    /**
     * Constructors
     *
     * to initialize the level must pass the credit hours finished
     * or use the setter and pass a level object
     * */
    public Enrolment(Term term, String year, int creditHrsFinished) {
        this.term = term;
        this.year = year;
        level = Level.setLevel(creditHrsFinished);
    }

    /** Methods */
    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public void setLevel(int creditHrsFinished) {
        level = Level.setLevel(creditHrsFinished);
    }

    public Term getTerm() {
        return term;
    }

    public void setTerm(Term term) {
        this.term = term;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getCreditHrsFinished() {
        return creditHrsFinished;
    }

    public void setCreditHrsFinished(int creditHrsFinished) {
        this.creditHrsFinished = creditHrsFinished;
        level = Level.setLevel(creditHrsFinished);
    }

    @Override
    public String toString() {
        return String.format("Level:\t%s\n" +
                             "Term:\t%s\n",
                             level.getDisplayName(),
                             term.getDisplayName() + '\t' + year);
    }
}
