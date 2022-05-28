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
    }

    public Tutors getTutors() {
        return tutors;
    }

    public void setTutors(Tutors tutors) {
        this.tutors = tutors;
    }

    public double getAbsence() {
        return absence;
    }

    public void setAbsence(double absence) {
        this.absence = absence;
    }

    @Override
    public String toString() {
        return String.format("""
                        Course:\t%s
                        Course Code:\t%s
                        Level:\t%s
                        Credit Hours:\t%d
                        Tutors:
                        %sTerm:\t%s
                        Marks:
                        %sAbsence:\t%f

                        The course has been taken %d times.""",
                             courseName, courseCode, level.getDisplayName(),
                             creditHrs, tutors.toString(),
                             term.getDisplayName() + '\t' + year,
                             marks.toString(), absence, timesOfTakingCourse);
    }

    // Checks if the student has passed the course
    public boolean isPassed() {
        return !(marks.getTotalMark() < 50);
    }

    // Returns the weighted gpa of the course
    public double getWeightedGpa() {
        return creditHrs * marks.getGpaScale();
    }
}
