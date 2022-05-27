package edu.cds.universityregistrationsystem.studentmanagement;

import java.time.LocalDate;

    /**
     *  This class stores and organizes the details of each transaction done by the student
     **/
public class Transaction {

    /** Data fields */
    private int amountPaid;
    private Long transactionNumber;
    private String bankOfTransaction;
    private LocalDate dateOfTransaction;

    /** Constructors */
    public Transaction() {
        amountPaid = 0;
        transactionNumber = Long.MIN_VALUE;
        bankOfTransaction = null;
        dateOfTransaction = null;
    }

    public Transaction(int amountPaid, Long transactionNumber, String bankOfTransaction, String dateOfTransaction) {
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

    public Long getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(String transactionNumber) {
        this.transactionNumber = Long.parseLong(transactionNumber);
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
        // Input in YYYY-MM-DD format
        this.dateOfTransaction = LocalDate.parse(dateOfTransaction);
    }

    @Override
    public String toString() {
        // formats a transaction's arranged details
        return String.format("Bank of Transaction: \t\t%s\n" +
                             "Transaction Number: \t\t\t%d\n" +
                             "Date of the Transaction: \t\t%d/%d/%d\n" +
                             "Amount Paid:\t\t\t\t\t%d",
                             bankOfTransaction, transactionNumber,
                             dateOfTransaction.getDayOfMonth(), dateOfTransaction.getMonthValue(),
                             dateOfTransaction.getYear(), amountPaid);
    }
}
