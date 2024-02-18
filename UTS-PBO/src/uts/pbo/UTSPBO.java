/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts.pbo;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class UTSPBO {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistem perpustakaan");
        System.out.println("===================");
        BukuDiktat b1 = new BukuDiktat("123", "Ganesha", "Pemrograman Java Dasar", "Paijo");
        BukuDiktat b2 = new BukuDiktat("124", "Andi Offset", "Pemrograman Java Lanjut", "Paijo");
        BukuDiktat b3 = new BukuDiktat("125", "Andi Offset", "Pemrograman Web Dasar", "Sri Sulastri");
        BukuDiktat b4 = new BukuDiktat("125", "Andi Offset", "Pemrograman Web Lanjut", "Sri Sulastri");
        BukuDiktat b5;
        
        Majalah m1 = new Majalah("131", "Elek Media", "Komputek", "200");
        Majalah m2 = new Majalah("132", "Elek Media", "Trubus", "100");
        
        Anggota a1 = new Anggota("112", "Ariel");
        Anggota a2 = new Anggota("113", "Fadil");
        Anggota a4 = new Anggota("175", "Joni");
        for(int j  = 0; j < 2; j++){
            addAnggota(scanner);
        }
        
        
        /*a1.addBuku(b1);
        a1.addBuku(b2);
        a1.displayBukuDipinjam();
        System.out.println("");
        a2.addBuku(b3);
        a2.addBuku(b1);
        a2.addBuku(m1);
        a2.displayBukuDipinjam();
        System.out.println("");
        a4.addBuku(m1);
        a4.displayBukuDipinjam();*/
    }
    public String pilihPenerbit(Scanner scanner){
         String penerbit=null;
         System.out.print("1. Elek Media\n");
         System.out.print("2. Ganesha\n");
         System.out.print("3. Andi Offset\n");
         System.out.print("4. Lainnya\n");
         System.out.print("Masukkan angka untuk memilih penerbit ");
         int pilih_penerbit = scanner.nextInt();
         System.out.print("\n");
         if(pilih_penerbit == 1)
                penerbit = "Elek Media";
         if(pilih_penerbit == 2)
                penerbit = "Ganesha";
         if(pilih_penerbit == 3)
                penerbit = "Andi Offset";
         return penerbit;
     }
    public static String pilihPengarang(Scanner scanner){
         String pengarang=null;
         String judul=null;
         int pilih_judul;
         String hasil[] = new String[2];
         System.out.print("1. Sri Sulastri\n");
         System.out.print("2. Paijo\n");
         System.out.print("Masukkan angka untuk memilih pengarang ");
         int pilih_pengarang = scanner.nextInt();
         if(pilih_pengarang == 1){
                pengarang = "Sri Sulastri";
                System.out.print("1. Pemrograman Web Dasar\n");
                System.out.print("2. Pemrograman Web Lanjut\n");
                System.out.print("Masukkan angka untuk memilih judul ");
                pilih_judul = scanner.nextInt();
                if(pilih_judul == 1)
                judul = "Pemrograman Web Dasar";
                else 
                judul = "Pemrograman Web Lanjut";
         }
         if(pilih_pengarang == 2){
                pengarang = "Paijo";
                System.out.print("1. Pemrograman Java Dasar\n");
                System.out.print("2. Pemrograman Java Lanjut\n");
                System.out.print("Masukkan angka untuk memilih judul ");
                pilih_judul = scanner.nextInt();
                if(pilih_judul == 1)
                judul = "PemrogramanJavaDasar";
                else 
                judul = "PemrogramanJavaLanjut";
         }
         return judul+ " " +pengarang;
     }
     public static void addAnggota(Scanner scanner){  
              System.out.print("Masukkan id anggota ");
              String id = scanner.next();
              System.out.print("Masukkan nama anggota ");
              String nama = scanner.next();System.out.print("\n");
              Anggota a3 = new Anggota(id, nama);
              addBuku(scanner, a3);
     }
     public static String[] splitData(String concatenatedData) {
        String[] result = new String[2];
        int separatorIndex = concatenatedData.indexOf(";");
        System.out.print(separatorIndex);
        System.out.print("\n");
        /*result[0] = concatenatedData.substring(0, separatorIndex);
        result[1] = concatenatedData.substring(separatorIndex + 1);*/
        return result;
    }
     public static void addBuku(Scanner scanner, Anggota a3){  
         UTSPBO obj = new UTSPBO();
         String penerbit1;
         String hasil1;
         String judul1;
         String pengarang1;
         String edisi = null;
         int b=0;
         System.out.print("1. Buku diktat\n");
         System.out.print("2. Majalah\n");
         System.out.print("Masukkan angka yang yang akan dipilih ");
         int x = scanner.nextInt();
              switch(x){
                  case 1 :
                      System.out.print("Masukkan id buku yang ingin dipinjam ");
                      String id_buku = scanner.next();
                      penerbit1 = obj.pilihPenerbit(scanner);
                      hasil1 = obj.pilihPengarang(scanner);
                      String[] splitData = hasil1.split("\\s");
                      judul1 = splitData[0];
                      pengarang1 = splitData[1];
                      System.out.println(hasil1);
                      BukuDiktat b5 = new BukuDiktat(id_buku, penerbit1, judul1,pengarang1);
                      a3.addBuku(b5,b);
                      a3.displayBukuDipinjam();
                      System.out.print("\n");
                      break;
                  case 2 : 
                      System.out.print("Masukkan id majalah yang ingin dipinjam ");
                      String id_majalah = scanner.next();
                      System.out.print("Masukkan judul majalah yang ingin dipinjam ");
                      String nama_majalah = scanner.next();
                      penerbit1 = obj.pilihPenerbit(scanner);
                      if(nama_majalah.equals("Komputek")){
                          edisi = "200";
                          b = 1;
                      }
                      else{
                          edisi = "100";
                          b = 1;
                      }
                      System.out.print(b);
                      Majalah m3 = new Majalah(id_majalah, penerbit1, nama_majalah, edisi);
                      a3.addBuku(m3,b);
                      a3.displayBukuDipinjam();
                      System.out.print("\n");
                      break;
              }
              System.out.println("Apakah anda mau menambah item lagi ?");
              String jawab = scanner.next();
              if(jawab.equals("Y")){
                  addBuku(scanner, a3);
              }
     }  
}
