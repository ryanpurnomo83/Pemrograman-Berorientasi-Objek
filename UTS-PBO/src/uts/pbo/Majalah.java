/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.pbo;

/**
 *
 * @author lenovo
 */
public class Majalah extends Buku{
    String namaMajalah;
    String edisi;
    
    public Majalah(String id_buku, String penerbit, String namaMajalah, String edisi){
        super(id_buku, penerbit);
        this.namaMajalah = namaMajalah;
        this.edisi = edisi;
    }
    
    public String getNamaMajalah(){
        return namaMajalah;
    }
    
    public String getEdisi(){
        return edisi;
    }
}
