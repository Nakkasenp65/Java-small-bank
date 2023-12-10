/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbanksystem;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author nakka
 */
public class AccountData implements Serializable{
    
    
    private HashMap<String, Account> accounts; 
    private int nextAccountNumber; 
    private List<TransactionRecord> transactionRecords = new ArrayList<>();
        
    public AccountData(HashMap<String, Account> accounts, int nextAccountNumber,List<TransactionRecord> transactionRecords) {
        this.accounts = accounts;
        this.nextAccountNumber = nextAccountNumber;
        this.transactionRecords = transactionRecords;
    }
    
    public HashMap<String, Account> getAccounts() {
        return accounts;
    }
    
    public int getNextAccountNumber() {
        return nextAccountNumber;
    }

    public List<TransactionRecord> getTransactionRecords() {
        return transactionRecords;
    }
    
    
}

    
