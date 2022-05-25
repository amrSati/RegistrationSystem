package edu.cds.registrationsystem;

public class CreditHours {
     /** Data fields */
     private int maxHours;
     private int finishedHours;
     private int currentHours;
     private int remainingHours;

     /** Constructors */
     public CreditHours() {
          maxHours = 0;
          finishedHours = 0;
          currentHours = 0;
          setRemainingHours();
     }

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

     public void setMaxHours(int maxHours) {
          this.maxHours = maxHours;
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
