package edu.cds.universityregistrationsystem.coursesmanagement;

public class Marks {

    /** Data fields */
    private double totalMark;  // out of 100
    private double finalExam;  // out of 40
    private double firstTest;  // out of 30
    private double secondTest; // out of 20
    private double yearWork;   // out of 10
    private String grade;
    private double gpaScale;

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
        setGradeAndGpaScale();
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
        setGradeAndGpaScale();
        return totalMark;
    }

    public String getGrade() {
        return grade;
    }

    public double getGpaScale() {
        return gpaScale;
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

    // Assigns grade and gpa scale based on mark
    private void setGradeAndGpaScale() {
        if (totalMark >= 95 && totalMark <= 100) {
            grade = "A";
            gpaScale = 4;
        }
        else if (totalMark >= 90 && totalMark < 95) {
            grade = "A-";
            gpaScale = 3.67;
        }
        else if (totalMark >= 85 && totalMark < 90) {
            grade = "B+";
            gpaScale = 3.33;
        }
        else if (totalMark >= 80 && totalMark < 85) {
            grade = "B";
            gpaScale = 3;
        }
        else if (totalMark >= 75 && totalMark < 80) {
            grade = "B-";
            gpaScale = 2.67;
        }
        else if (totalMark >= 70 && totalMark < 75) {
            grade = "C+";
            gpaScale = 2.33;
        }
        else if (totalMark >= 65 && totalMark < 70) {
            grade = "C";
            gpaScale = 2;
        }
        else if (totalMark >= 60 && totalMark < 65) {
            grade = "C-";
            gpaScale = 1.67;
        }
        else if (totalMark >= 55 && totalMark < 60) {
            grade = "D+";
            gpaScale = 1.33;
        }
        else if (totalMark >= 50 && totalMark < 55) {
            grade = "D";
            gpaScale = 1;
        }
        else {
            grade = "F";
        }
    }
}
