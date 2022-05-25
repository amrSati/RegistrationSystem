package edu.cds.registrationsystem;

public class CourseData {

    /** Data fields */
    private String name;
    private String code;
    private int creditHrs;
    private int timesOfTakingCourse;
    private int semester;
    private int year;
    private Marks marks;
    private Tutors tutors;
    private String grade;
    private double absence;

    /** Constructors */
    public CourseData() {
        name = null;
        creditHrs = 0;
        timesOfTakingCourse = 0;
        semester = 0;
        year = 0;
        marks = null;
        tutors = null;
        grade = null;
        absence = 0.0;
    }

    public CourseData(String name,
                      int code,
                      int creditHrs,
                      int timesOfTakingCourse,
                      int semester,
                      int year,
                      Marks marks,
                      Tutors tutors,
                      double absence) {
        this.name = name;
        this.code = code;
        this.creditHrs = creditHrs;
        this.timesOfTakingCourse = timesOfTakingCourse;
        this.semester = semester;
        this.year = year;
        this.marks = marks;
        this.tutors = tutors;
        this.absence = absence;

        setGrade();
    }

    /** Methods */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
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
}
