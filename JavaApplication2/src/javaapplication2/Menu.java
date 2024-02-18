/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class Menu {
    public static void main(String[] args) {
        int pinNum;
        int userOption = 0;
        System.out.println("ATM system");
        System.out.println("..........");
        Account acc1 = new Account(5000,1234);
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();
        pinNum = sc.nextInt();
        if(acc1.validatePin(pinNum)){
            System.out.println("success..");
            do{
                atm.menu();
                userOption = sc.nextInt();
                switch(userOption){
                    case 1 : 
                        atm.withDrawMenu();
                        double withDrawAmount = sc.nextDouble();
                        acc1.withDraw(withDrawAmount);break;
                    case 2 : 
                        atm.depositMenu();
                        double depositAmount=sc.nextDouble();
                        acc1.deposit(depositAmount);break;
                    case 3 :
                        atm.balanceMenu(acc1.getBalance());break;
                    case 4 : 
                        atm.exitMenu();break;
                    default :
                        atm.invalidMessageMenu();break;
                    }
                }while(userOption!=4); 
        }       
    }
}
    
        /*
        System.out.println(acc1.getBalance());
        acc1.deposit(700);
        System.out.println(acc1.getBalance());
        acc1.withDraw(4500);
        System.out.println(acc1.getBalance());*/
       

