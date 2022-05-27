package edu.cds.universityregistrationsystem.coursesmanagement;

/**
 *  Stores and organizes credit hours for the student
 */
public class CreditHours {
     /** Data fields */
     private final int maxHours;
     private int finishedHours;
     private int currentHours;
     private int remainingHours;


     /** Constructors */
     public CreditHours(int maxHours, int finishedHours, int currentHours) {
          this.maxHours = maxHours;
          this.finishedHours = finishedHours;
          this.currentHours = currentHours;
          setRemainingHours();
     }

     /** Methods */
     public int getMaxHours() {
          return maxHours;
     }

     public int getFinishedHours() {
          return finishedHours;
     }

     public void setFinishedHours(int finishedHours) {
          this.finishedHours = finishedHours;
     }

     public int getCurrentHours() {
          return currentHours;
     }

     public void setCurrentHours(int currentHours) {
          this.currentHours = currentHours;
     }

     public int getRemainingHours() {
          setRemainingHours();
          return remainingHours;
     }

     private void setRemainingHours() {
          remainingHours = maxHours - finishedHours - currentHours;
     }
}
