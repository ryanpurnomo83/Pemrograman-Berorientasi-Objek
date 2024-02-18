/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;
import java.time.LocalDate;
/**
 *
 * @author lenovo
 */
public class TestPenjualan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pelanggan p1 = new Pelanggan("Karyo", "Jln. Semarang");
        Pelanggan p2 = new Pelanggan("Ujang", "Jln. Bandung");
        
        Barang b1 = new Barang("Oli Mesin Astra", "botol(5 liter)", 200000, 10);
        Barang b2 = new Barang("Oli Gardan", "botol(1 liter)", 3000, 10);
        Barang b3 = new Barang("Kampas Rem Depan Avanza", "1 set", 450000, 10);
        Barang b4 = new Barang("Kampas Rem Belakang Avanza", "1 set", 400000, 10);
        
        PenjualanDetail pd1 = new PenjualanDetail(b1,1);
        PenjualanDetail pd2 = new PenjualanDetail(b2,2);
        PenjualanDetail pd3 = new PenjualanDetail(b3,1);
        PenjualanDetail pd4 = new PenjualanDetail(b1,4);
        PenjualanDetail pd5 = new PenjualanDetail(b4,2);
        
        Penjualan jual1 = new Penjualan(LocalDate.now(), p1);
        jual1.add(pd1);
        jual1.add(pd2);
        jual1.add(pd3);
        jual1.printInfo();
        
        System.out.println("");
        System.out.println("");
        Penjualan jual2 = new Penjualan(LocalDate.now(),p2);
        jual2.add(pd4);
        jual2.add(pd5);
        
        jual2.printInfo();
    }
    
}
