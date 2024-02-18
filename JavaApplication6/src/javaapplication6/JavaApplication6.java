/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author D2A
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Menu mn = new Menu();
       String nims = null;
       String nams = null;
       float ipks = 0;
       Mhs mhss = new Mhs(nims, nams, ipks);
       int pilihan;
       do{
           System.out.println("Pilihan anda (1-6): ");
           pilihan = sc.nextInt();
           switch(pilihan){
               case 1: 
                   ArrayList<Mhs> listMhs = new ArrayList<Mhs>();
                   System.out.println("Tambah data");
                   System.out.print("Nim : ");
                   nims = sc.nextLine();
                   System.out.print("Nama : ");
                   nams = sc.nextLine();
                   System.out.print("IPK : ");
                   ipks = sc.nextFloat();        
                   listMhs.add(mhss);break;
               case 2: 
                   System.out.println("Print Daftar");mhss.printInfo();break;
               case 3: 
                   System.out.println("Cari data");break;
               case 4: 
                   System.out.println("Hapus data");break;
               case 5: 
                   System.out.println("Hapus semua data");break;
               default:
                   System.out.println("Keluar dari Aplikasi ");break;
           }
       }while(pilihan != 6);
       System.out.println("Program selesai");
    } 
}
