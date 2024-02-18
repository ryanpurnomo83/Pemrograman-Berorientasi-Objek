/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author lenovo
 */
public class ATM {
    public ATM(){
        System.out.println("Enter your pin ");
    }
    public void menu(){
            System.out.println("\n1. Withdraw ");
            System.out.println("\n2. Deposit ");
            System.out.println("\n3. Balance Inquiry ");
            System.out.println("\n4. Exit ");
    }
    public void withDrawMenu(){
        System.out.println("Enter an amount to withdraw ");
    }
    public void depositMenu(){
        System.out.println("Enter an amount to deposit");
    }
    public void balanceMenu(double balance){
        System.out.printf("The balance is %.2f", balance);
    }
    public void invalidMessageMenu(){
        System.out.println("invalid options, try again");
    }
    public void exitMenu(){
        System.out.println("Thanks for banking with us ");
    }
}
