package edu.cds.universityregistrationsystem.studentmanagement;

import java.util.Stack;

    /**
     *
     *  Organizes payments of the student
     *  using a stack storing in it each transaction details
     *
     **/
public class Payments {

    /** Data fields */
    private String typeOfFunding;
    private int totalAmountPaid;
    private int numberOfPaymentsDone;
    private Stack<Transaction> paymentsDetails = new Stack<>();

     /**
      *  Constructor
      *
      *  Only takes the type of funding of the student
      *  and the payments details should be added manually,
      *
      *  the number of all payments done and the total amount
      *  shall be calculated automatically
      **/
    public Payments(String typeOfFunding) {
        this.typeOfFunding = typeOfFunding;
        totalAmountPaid = 0;
        numberOfPaymentsDone = 0;
    }

    /** Methods */
    public String getTypeOfFunding() {
        return typeOfFunding;
    }

    public void setTypeOfFunding(String typeOfFunding) {
        this.typeOfFunding = typeOfFunding;
    }

    public int getNumberOfPaymentsDone() {
        return numberOfPaymentsDone;
    }

    public int getTotalAmountPaid() {
        return totalAmountPaid;
    }

    // Adds a new payment into payments details stack
    public void addPayment(Transaction transaction) {
        paymentsDetails.push(transaction);

        /**
         *  Increment total amount paid so far, and number of payments
         **/
        totalAmountPaid += transaction.getAmountPaid();
        numberOfPaymentsDone++;
    }

    // Returns an array of payments details
    public Transaction[] viewPayments() {
        // Copy transactions details stack
        Stack<Transaction> transactions = (Stack<Transaction>) paymentsDetails.clone();

        /**
         *  Store stack of details into array
         *  
         *  the array's first element is the latest payment details
         **/
        Transaction[] paymentsDetails = new Transaction[transactions.size()];
        for (int i = 0; i < transactions.size(); i++)
            paymentsDetails[i] = transactions.pop();

        return paymentsDetails;
    }

    // Returns a string of details of the latest payment
    public String getLatestPayment() {
        return paymentsDetails.peek().toString();
    }

}
