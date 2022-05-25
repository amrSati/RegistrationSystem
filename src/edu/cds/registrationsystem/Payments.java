package edu.cds.registrationsystem;

import java.util.Stack;

public class Payments {


    /** Data fields */
    private String typeOfFunding;
    private int totalAmountPaid;
    private int numberOfPaymentsDone;
    private Stack<Transaction> paymentsDetails = new Stack<>();

    /** Constructor */
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

        // Increment total payments amount and number of payments
        totalAmountPaid += transaction.getAmountPaid();
        numberOfPaymentsDone++;
    }

    // Returns an array of required latest payments details
    public Transaction[] viewPayments() {
        // Copy transactions details stack
        Stack<Transaction> transactions = (Stack<Transaction>) paymentsDetails.clone();

        /**
         *  Store stack of details into array
         *  
         *  the array's first element is the latest payment details
         **/
        Transaction[] payments1 = new Transaction[transactions.size()];
        for (int i = 0; i < transactions.size(); i++)
            payments1[i] = transactions.pop();

        return payments1;
    }

}
