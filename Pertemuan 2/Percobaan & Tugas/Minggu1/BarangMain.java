/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu1;

import Minggu2.Barang;

/** 
 * Nama     : Dandi Agung Setiawan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class BarangMain {
    public static void main(String[] args) {
        Barang b1 = new Barang();
        
        b1.namaBarang = "Corsair 2 GB";
        b1.jenisBarang = "DDR";
        b1.hargaSatuan = 250000;
        b1.stok = 10;
        b1.tambahStok(1);
        b1.kurangiStok(3);
        b1.tampilBarang();
        int hargaTotal = b1.hitungHargaTotal(4);
        System.out.println("Harga 4 Buah\t: " + hargaTotal);
        
        Barang b2 = new Barang("Logitect", "Wireless Mouse", 25, 150000);
        b2.tampilBarang();
    }
}
