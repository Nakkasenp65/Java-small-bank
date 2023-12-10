/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbanksystem;

import java.io.Serializable;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author nakka
 */
public class Account implements Serializable{
    
    private static final long serialVersionUID = 1L;
    /*
    
    1. account has name address balance and account number.
    2. we can created account and pin the account number with it.
    
    new plan!
    1. Create manage obj that contain account obj 
    2. use manage obj to create account obj 
    
    */
    
    String name;
    String address;
    double balance;
//    int accNumber = 1;
    
    public Account(String name, String address, double balance){
        this.name = name;
        this.address = address;
        this.balance = balance;
    }
    
    public String information(){
        DecimalFormat df = new DecimalFormat("#,###.00");
        String information = 
                "Name : "+name+"\n"+
                "Address : "+address+"\n"+
                "Balance : "+df.format(balance);
        return information;
    }
    
    public void deposit(double amount){
        this.balance += amount;
    }
    
    public void withdraw(double amount){
        if(amount>this.balance){
            JOptionPane.showMessageDialog(null, "Sorry, your balance is under amount");
        }
        else this.balance -= amount;
        
    }
    
    public String recorder(){
        return "Empty";
    }
    
}
