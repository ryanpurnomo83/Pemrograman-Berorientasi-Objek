/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TesTabungan;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class TesTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        // TODO code application logic here
        Tabungan nasabah1 = new Tabungan("Joko",1000);
                 nasabah1.lihatSaldo();
        System.out.print("Masukkan nama ");
        String nama2 = sc.nextLine();
        System.out.print("Saldo awal ");
        int jml2 = sc.nextInt();
        Tabungan nasabah2 = new Tabungan(nama2, jml2);
                 nasabah2.lihatSaldo();
        System.out.print("Jumlah Setor ");
            jml2 = sc.nextInt();
                 nasabah2.setor(jml2);
        do{
        System.out.print("Masukkan angka yang ingin dipilih ");
        System.out.print("\n1. Setor"+
                         "\n2. Tarik"+
                         "\n3. Lihat Saldo"+
                         "\n4. Keluar\n\n");
            pilihan = sc.nextInt();
            switch(pilihan){
                case 1 : System.out.print("Masukkan jumlah uang yang ingin disetor ");
                           jml2 = sc.nextInt();
                           nasabah2.setor(jml2);break;
                case 2 : System.out.print("Masukkan jumlah uang yang ingin diambil ");
                           int tarik = sc.nextInt();
                           nasabah2.tarik(tarik);break;
                case 3 : nasabah2.lihatSaldo();
            }
        }while(pilihan!=4); 
    } 
}