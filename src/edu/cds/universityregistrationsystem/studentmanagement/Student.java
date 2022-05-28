package edu.cds.universityregistrationsystem.studentmanagement;

import edu.cds.universityregistrationsystem.coursesmanagement.Courses;
import edu.cds.universityregistrationsystem.coursesmanagement.CreditHours;
import edu.cds.universityregistrationsystem.coursesmanagement.GPA;
import edu.cds.universityregistrationsystem.paymentsmanagement.Payments;

/**
 *
 * Organizes the data of the students as requested
 *
 */
public class Student {

    /** Data fields */
    private int numberOfStudents = 0;
    private Enrolment firstEnrolment;
    private Name name;
    private Age age;
    private Gender gender;
    private NationalID id;
    private Address address;
    private MailingAddress mailingAddress;
    private Contact contactInfo;
    private Major major;
    private Department department;
    private RegistrationNumber registrationNumber;
    private Level level;
    private Term term;
    private Payments payments;
    private CreditHours creditHours;
    private Courses courses;
    private GPA gpa;

    /** Constructor */



}
