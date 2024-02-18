/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.pbo;

/**
 *
 * @author lenovo
 */
public class Buku {
    String id_buku;
    String penerbit;
    char statusPinjam;
    
    public Buku(String id_buku, String penerbit){
        this.id_buku = id_buku;
        this.penerbit = penerbit;
        this.statusPinjam = 'F';
    }
    
    public String getIdBuku(){
        return id_buku;
    }
    
    public String getPenerbit(){
        return penerbit;
    }
    
    
    public boolean setStatusPinjam(){
        if (statusPinjam == 'F') {
            statusPinjam = 'T';
            return true;
        } else {
            return false;
        }
    }
}
