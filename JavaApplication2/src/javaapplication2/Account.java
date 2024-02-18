/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author lenovo
 */
public class Account implements Transactions{
    private final int accountNumber;
    private int pin;
    private double balance;
    private static int nextAccountNumber = 1001;
    public Account(double bal, int pin){
        this.balance = bal;
        this.pin = pin;
        accountNumber = getNextAccountNumber();
    }
    public boolean validatePin(int p){
        if(this.pin==p){
            return true;
        }
        System.out.println("Invalid PIN");
        return false;
    }
    public int getAccountNumber(){return accountNumber;}
    public static int getNextAccountNumber(){
        int accNo = nextAccountNumber;
        nextAccountNumber++;
        return accNo;
    }
    @Override
    public boolean withDraw(double debitATM){
        if(debitATM>balance){
            System.out.println("Insufficient Fund");
            return false;
        }
        balance-=debitATM;
        System.out.println("Please take your card and money");
        return true;
    }
    @Override
    public boolean deposit(double creditATM){
        balance+=creditATM;
        System.out.println("Deposit succesful");
        return true;
    }
    @Override
    public double getBalance(){
        return balance;
    }
}
