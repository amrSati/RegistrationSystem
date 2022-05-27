package edu.cds.universityregistrationsystem.coursesmanagement;

public class GPA {

    /** Data fields */
    private double gpa;
    private int semestersFinished;
    private double[] individualGPA = new double[10];

    /** Constructors */
    public GPA() {
        gpa = 0.0;
        semestersFinished = 0;
        for (double g: individualGPA)   g = 0.0;
    }

    public GPA(double gpa, int semestersFinished, double[] individualGPA) {
        this.gpa = gpa;
        this.semestersFinished = semestersFinished;
        this.individualGPA = individualGPA;
    }

    /** Methods */
    public double getGPA() {
        return gpa;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public int getSemestersFinished() {
        return semestersFinished;
    }

    public void setSemestersFinished(int semestersFinished) {
        this.semestersFinished = semestersFinished;
    }

    public double[] getIndividualGPA() {
        return individualGPA;
    }

    public void setIndividualGPA(double[] individualGPA) {
        this.individualGPA = individualGPA;
    }
}