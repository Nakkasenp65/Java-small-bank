/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbanksystem;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.time.LocalDate;

/**
 *
 * @author nakka
 */
//public class Recorder {
//    
//}

public class TransactionRecord implements Serializable{
    private static final long serialVersionUID = 1L; 
    private String transactionType;
    private LocalDate transactionDate;
    private int transactionNumber;
    private double transactionAmount;

    public TransactionRecord(String transactionType, LocalDate transactionDate,int transactionNumber, double transactionAmount) {
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
        this.transactionAmount = transactionAmount;
        this.transactionNumber = transactionNumber;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public int getTransactionNumber() {
        return transactionNumber;
    }
    
        @Override
    public String toString() {
//        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        DecimalFormat df = new DecimalFormat("#,###.00");
        return transactionNumber + " | " +transactionType + " | " + transactionDate + " | " +  df.format(transactionAmount);
    }
    
    
}