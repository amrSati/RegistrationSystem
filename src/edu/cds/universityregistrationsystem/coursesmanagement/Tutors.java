package edu.cds.universityregistrationsystem.coursesmanagement;

import edu.cds.universityregistrationsystem.studentmanagement.Name;

public class Tutors {

    /** Data fields */
    private Name lecturer;
    private Name courseGTA;
    private Name labGTA;

    /** Constructor */
    public Tutors(Name lecturer, Name courseGTA, Name labGTA) {
        this.lecturer = lecturer;
        this.courseGTA = courseGTA;
        this.labGTA = labGTA;
    }

    /** Methods */
    public Name getLecturer() {
        return lecturer;
    }

    public void setLecturer(Name lecturer) {
        this.lecturer = lecturer;
    }

    public Name getCourseGTA() {
        return courseGTA;
    }

    public void setCourseGTA(Name courseGTA) {
        this.courseGTA = courseGTA;
    }

    public Name getLabGTA() {
        return labGTA;
    }

    public void setLabGTA(Name labGTA) {
        this.labGTA = labGTA;
    }

    @Override
    public String toString() {
        return String.format("Lecturer:\t%s\n" +
                             "Course GTA:\t%s\n" +
                             "Lab GTA:\t%s\n",
                             lecturer.getFullName(),
                             courseGTA.getFullName(),
                             labGTA.getFullName());
    }
}