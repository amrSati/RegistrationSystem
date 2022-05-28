package edu.cds.universityregistrationsystem.coursesmanagement;

import java.util.Stack;

public class GPA {

    /** Data fields */
    private double gpa;
    private int creditHrs;
    private int semestersFinished = 0;
    private Stack<Double> individualGPA = new Stack<>();
    private CourseData[] courses;

    /** Constructor */
    public GPA(int creditHrs, CourseData[] courses) {
        this.creditHrs = creditHrs;
        this.courses = courses;
        calculateGpa();
        semestersFinished++;
    }

    /** Methods */
    public double getGPA() {
        return gpa;
    }

    public int getSemestersFinished() {
        return semestersFinished;
    }

    // Calculate the weighted gpa
    private void calculateGpa() {
        double total = 0;

        for (CourseData courseData: courses)
            total += courseData.getWeightedGpa();

        gpa = total / creditHrs;
    }
}