/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TesTabungan;

/**
 *
 * @author lenovo
 */
public class Tabungan {
     private String nama;
    private int saldo;
    Tabungan(String nama, int jml){
        this.nama = nama;
        this.saldo = jml;
    } 
    void lihatSaldo(){
        System.out.println("Nama\t: " +nama);
        System.out.println("Saldo\t: " +saldo);
    }
    void setNama(String nama){
        this.nama = nama;
    }
    String getNama(){
        return this.nama;
    }
    void setSaldo(int saldo){
        this.saldo=saldo;
    }
    int getSaldo(){
        return saldo;
    }
    void setor(int jml){
        saldo=saldo+jml;
    }
    void tarik(int sld){
        if(sld > saldo){
            System.out.print("Maaf Saldo tidak dapat diambil");
        }
        else{
            saldo = saldo - sld;
            System.out.println("Saldo anda terambil sebanyak " +sld+ " dan sisa saldo anda " +saldo);
        }
    }
}
