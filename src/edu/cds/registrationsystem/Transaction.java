package edu.cds.registrationsystem;

import java.time.LocalDate;

public class Transaction {

    /** Data fields */
    private int amountPaid;
    private long transactionNumber;
    private String bankOfTransaction;
    private LocalDate dateOfTransaction;

    /** Constructors */
    public Transaction() {
        amountPaid = 0;
        transactionNumber = 0;
        bankOfTransaction = null;
        dateOfTransaction = null;
    }

    public Transaction(int amountPaid, long transactionNumber, String bankOfTransaction, String dateOfTransaction) {
        this.amountPaid = amountPaid;
        this.transactionNumber = transactionNumber;
        this.bankOfTransaction = bankOfTransaction;
        this.dateOfTransaction = LocalDate.parse(dateOfTransaction);
    }

    /** Methods */
    public int getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }

    public long getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(long transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public String getBankOfTransaction() {
        return bankOfTransaction;
    }

    public void setBankOfTransaction(String bankOfTransaction) {
        this.bankOfTransaction = bankOfTransaction;
    }

    public String getDateOfTransaction() {
        return dateOfTransaction.toString();
    }

    public void setDateOfTransaction(String dateOfTransaction) {
        this.dateOfTransaction = LocalDate.parse(dateOfTransaction);
    }
}
