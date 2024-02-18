/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author D2A
 */
public class Mhs {
    String nim;
    String nama;
    float ipk;
    
    public Mhs(String nim, String nama, float ipk){
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    public Mhs(){
        System.out.println("Enter your pin ");
    }
    
    public String getNim(){
        return nim;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public float getIpk(){
        return ipk;
    }
    public void setIpk(float ipk){
        this.ipk = ipk;
    }

    
    void printInfo() {
           System.out.println("NIM : " + nim);
           System.out.println("Nama : " + nama);
           System.out.println("IPK : " + ipk);
    }
}
