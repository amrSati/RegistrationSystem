package edu.cds.universityregistrationsystem.coursesmanagement;

public class Marks {

    /** Data fields */
    private double totalMark;  // out of 100
    private double finalExam;  // out of 40
    private double firstTest;  // out of 30
    private double secondTest; // out of 20
    private double yearWork;   // out of 10

    /** Constructors */
    public Marks() {
        totalMark = 0.0;
        finalExam = 0.0;
        firstTest = 0.0;
        secondTest = 0.0;
        yearWork = 0.0;
    }

    public Marks(double finalExam, double firstTest, double secondTest, double yearWork) {
        this.finalExam = (finalExam <= 40) ? finalExam : 0.0;
        this.firstTest = (firstTest <= 30) ? firstTest : 0.0;
        this.secondTest = (secondTest <= 20) ? secondTest : 0.0;
        this.yearWork = (yearWork <= 10) ? yearWork : 0.0;
    }

    /** Methods */
    public double getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(double finalExam) {
        this.finalExam = (finalExam <= 40) ? finalExam : 0.0;
    }

    public double getFirstTest() {
        return firstTest;
    }

    public void setFirstTest(double firstTest) {
        this.firstTest = (firstTest <= 30) ? firstTest : 0.0;
    }

    public double getSecondTest() {
        return secondTest;
    }

    public void setSecondTest(double secondTest) {
        this.secondTest = (secondTest <= 20) ? secondTest : 0.0;
    }

    public double getYearWork() {
        return yearWork;
    }

    public void setYearWork(double yearWork) {
        this.yearWork = (yearWork <= 10) ? yearWork : 0.0;
    }

    public double getTotalMark() {
        totalMark = finalExam + firstTest + yearWork;
        return totalMark;
    }

    @Override
    public String toString() {
        return String.format("Total Mark:\t%f\n" +
                             "Year Work:\t%f\n" +
                             "Final Exam Mark:\t%f\n" +
                             "Second Test Mark:\t%f\n" +
                             "First Test Mark:\t%f\n",
                             totalMark,
                             yearWork,
                             finalExam,
                             secondTest,
                             firstTest);
    }
}
