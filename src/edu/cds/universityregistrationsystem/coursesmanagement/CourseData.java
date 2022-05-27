package edu.cds.universityregistrationsystem.coursesmanagement;

import edu.cds.universityregistrationsystem.studentmanagement.Level;
import edu.cds.universityregistrationsystem.studentmanagement.Term;

/**
 *  Courses specific data
 **/
public class CourseData {

    /** Data fields */
    private String courseName;
    private String courseCode;
    private Level level;
    private int creditHrs;
    private Term term;
    private String year;
    private Marks marks;
    private Tutors tutors;
    private String grade;
    private double absence;
    private int timesOfTakingCourse;

    /** Constructor */
    public CourseData(String courseName,
                      String courseCode,
                      Level level,
                      int creditHrs,
                      Term term,
                      String year,
                      Marks marks,
                      Tutors tutors,
                      double absence,
                      int timesOfTakingCourse) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.level = level;
        this.creditHrs = creditHrs;
        this.term = term;
        this.year = year;
        this.marks = marks;
        this.tutors = tutors;
        this.absence = absence;
        this.timesOfTakingCourse = timesOfTakingCourse;
    }

    /** Methods */
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getLevel() {
        return level.getDisplayName();
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public int getCreditHrs() {
        return creditHrs;
    }

    public void setCreditHrs(int creditHrs) {
        this.creditHrs = creditHrs;
    }

    public int getTimesOfTakingCourse() {
        return timesOfTakingCourse;
    }

    public void setTimesOfTakingCourse(int timesOfTakingCourse) {
        this.timesOfTakingCourse = timesOfTakingCourse;
    }

    public String getTerm() {
        return term.getDisplayName();
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

    public Marks getMarks() {
        return marks;
    }

    public void setMarks(Marks marks) {
        this.marks = marks;
        setGrade();
    }

    public Tutors getTutors() {
        return tutors;
    }

    public void setTutors(Tutors tutors) {
        this.tutors = tutors;
    }

    public String getGrade() {
        return grade;
    }

    public double getAbsence() {
        return absence;
    }

    public void setAbsence(double absence) {
        this.absence = absence;
    }

    // Assigns grade based on mark
    private void setGrade() {
        double totalMark = marks.getTotalMark();
        if (totalMark >= 95 && totalMark <= 100) grade = "A";
        else if (totalMark >= 90 && totalMark < 95) grade = "A-";
        else if (totalMark >= 85 && totalMark < 90) grade = "B+";
        else if (totalMark >= 80 && totalMark < 85) grade = "B";
        else if (totalMark >= 75 && totalMark < 80) grade = "B-";
        else if (totalMark >= 70 && totalMark < 75) grade = "C+";
        else if (totalMark >= 65 && totalMark < 70) grade = "C";
        else if (totalMark >= 60 && totalMark < 65) grade = "C-";
        else if (totalMark >= 55 && totalMark < 60) grade = "D+";
        else if (totalMark >= 50 && totalMark < 55) grade = "D";
        else    grade = "F";
    }

    @Override
    public String toString() {
        return String.format("Course:\t%s\n" +
                             "Course Code:\t%s\n" +
                             "Level:\t%s\n" +
                             "Credit Hours:\t%d\n" +
                             "Tutors:\n%s" +
                             "Term:\t%s\n" +
                             "Marks:\n%s" +
                             "Grade:\t%s\n" +
                             "Absence:\t%f\n" +
                             "\nThe course has been taken %d times.",
                             courseName, courseCode, level.getDisplayName(),
                             creditHrs, tutors.toString(),
                             term.getDisplayName() + '\t' + year,
                             marks.toString(), grade, absence, timesOfTakingCourse);
    }
}
