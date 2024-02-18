/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.pbo;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class Anggota {
    String id_anggota;
    String nama;
    ArrayList<Buku> listBuku = new ArrayList<>();
    public Anggota(String id_anggota, String nama){
        this.id_anggota = id_anggota;
        this.nama = nama;
    }
    
    public void addBuku(Buku lB, int a){
        if(lB.setStatusPinjam() && a == 1){
            System.out.print("Buku berhasil dipinjam \n");
            listBuku.add(lB);
        }else{
            System.out.println("Buku gagal dipinjam");
        }
    }
    
    
    public String getIdAnggota(){
        return id_anggota;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void displayBukuDipinjam(){
        System.out.println("Daftar Buku yang dipinjam : " + getNama());
            System.out.println("-------------------");
        for (Buku lB : listBuku) {
            if (lB instanceof BukuDiktat) {
                BukuDiktat bd = (BukuDiktat) lB;
                System.out.println("id:" + bd.getIdBuku() + ", penerbit:" + bd.getPenerbit() +
                        ", judul:" + bd.getJudul() + ", pengarang:" + bd.getPengarang());
            } else if (lB instanceof Majalah) {
                Majalah m = (Majalah) lB;
                System.out.println("id:" + m.getIdBuku() + ", penerbit:" + m.getPenerbit() +
                        ", nama:" + m.getNamaMajalah() + ", Edisi:" + m.getEdisi());
            }
        }
    }
}
