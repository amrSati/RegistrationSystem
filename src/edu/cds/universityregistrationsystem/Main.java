package edu.cds.universityregistrationsystem;

import edu.cds.universityregistrationsystem.studentmanagement.Age;
import edu.cds.universityregistrationsystem.studentmanagement.Gender;
import edu.cds.universityregistrationsystem.studentmanagement.Name;
import edu.cds.universityregistrationsystem.studentmanagement.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    static List<Student> studentsList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.printf("\t\t\t\tWelcome\n\n");
        //while (login())
          //  System.out.println("username or password is incorrect");

        int option = mainPage();

        switch (option) {
            case 0:
                System.exit(1);
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default: break;
        }

    }

    public static boolean login() {
        System.out.printf("username:\t");
        String userName = input.next();
        System.out.printf("password:\t");
        String passWord = input.next();

        return !userName.equals(Admin.userName) || !passWord.equals(Admin.passWord);
    }

    public static int mainPage() {
        int option;
        do {
            System.out.printf("""
                    \t\t\t\t-HOME-
                    1. Add new Student
                    2. View existing Student
                    3. Update existing Student
                    4. Delete existing Student
                    """);
            System.out.print("Enter option or (Enter 0 to exit): ");
            option = input.nextInt();
        } while(option < 0 || option > 4);

        return option;
    }

    public static void addStudent() {
        System.out.printf("\t\t\tNew Student");

        // Take input for student name
        System.out.print("Enter student's Name");
        System.out.printf("\nfirst name: ");
        String firstName = input.next();
        System.out.printf("\nmiddle name: ");
        String midName = input.next();
        System.out.printf("\nlast name: ");
        String lastName = input.next();
        Name studentName = new Name(firstName, midName, lastName);
        System.out.println();

        System.out.println("Enter the date of birth: (in YYYY-MM-DD format)");
        Age studentAge = new Age(input.next());
        System.out.println();

        System.out.printf("""
                        
                        Choose gender:
                        1. Male
                        2. Female
                        3. PreferNotToSay
                        """);
        Gender studentGender = switch (input.nextInt()) {
                                case 1 -> Gender.MALE;
                                case 2 -> Gender.FEMALE;
                                default -> Gender.PREFER_NOT_TO_SAY;
                                };


    }
}
