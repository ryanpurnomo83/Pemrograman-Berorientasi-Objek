/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.pbo;

/**
 *
 * @author lenovo
 */
public class BukuDiktat extends Buku{
    String judul;
    String pengarang;
    
    public BukuDiktat(String id_buku, String penerbit, String judul, String pengarang){
        super(id_buku, penerbit);
        this.judul = judul;
        this.pengarang = pengarang;
    }
    
    public String getJudul(){
        return judul;
    }
    
    public String getPengarang(){
        return pengarang;
    }
}
