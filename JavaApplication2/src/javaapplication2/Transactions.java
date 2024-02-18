/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author lenovo
 */
public interface Transactions {
    boolean withDraw(double creditATM);
    boolean deposit(double debitATM);
    double getBalance();
}
