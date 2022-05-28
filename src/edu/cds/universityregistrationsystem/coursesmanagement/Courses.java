package edu.cds.universityregistrationsystem.coursesmanagement;

import java.util.Stack;

/**
 * The class stores the courses that the student has been taken
 * or currently taking
 * and calculates the total credit hours finished and currently taking
 * -_-
 */
public class Courses {

    /** Data Fields */
    private int numberOfCourses;
    private int totalCreditHrs;
    private CourseData[] currentCourses;
    private Stack<CourseData> finishedCourses = new Stack<>();

    /** Constructors */
    public Courses(int numberOfCourses, int totalCreditHrs, CourseData[] currentCourses) {
        this.numberOfCourses = numberOfCourses;
        this.totalCreditHrs = totalCreditHrs;
        this.currentCourses = currentCourses;
        setFinishedCourses();
    }

    /** Methods */
    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }

    public int getTotalCreditHrs() {
        return totalCreditHrs;
    }

    public void setTotalCreditHrs(int totalCreditHrs) {
        this.totalCreditHrs = totalCreditHrs;
    }

    public CourseData[] getCurrentCourses() {
        return currentCourses;
    }

    public void setCurrentCourses(CourseData[] currentCourses) {
        this.currentCourses = currentCourses;
        setFinishedCourses();
    }

    public Stack<CourseData> getFinishedCourses() {
        return finishedCourses;
    }

    private void setFinishedCourses() {
        for (CourseData courseData: currentCourses)
            if (courseData.isPassed())  finishedCourses.push(courseData);
    }
}
