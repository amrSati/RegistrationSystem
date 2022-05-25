package edu.cds.registrationsystem;

public class Marks {

    /** Data fields */
    private double totalMark;
    private double finalExam;
    private double midterm;
    private double yearWork;

    /** Constructors */
    public Marks() {
        totalMark = 0.0;
        finalExam = 0.0;
        midterm = 0.0;
        yearWork = 0.0;
    }

    public Marks(double finalExam, double midterm, double yearWork) {
        this.finalExam = finalExam;
        this.midterm = midterm;
        this.yearWork = yearWork;
    }

    /** Methods */
    public double getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(double finalExam) {
        this.finalExam = finalExam;
    }

    public double getMidterm() {
        return midterm;
    }

    public void setMidterm(double midterm) {
        this.midterm = midterm;
    }

    public double getYearWork() {
        return yearWork;
    }

    public void setYearWork(double yearWork) {
        this.yearWork = yearWork;
    }

    public double getTotalMark() {
        totalMark = finalExam + midterm + yearWork;
        return totalMark;
    }
}
