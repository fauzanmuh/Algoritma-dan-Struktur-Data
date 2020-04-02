/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu2;
/** 
 * Nama     : Dandi Agung Setiawan
 * Kelas    : TI-1F
 * NIM      : 1941720009
 */
public class Barang {
    public String namaBarang, jenisBarang;
    public int stok, hargaSatuan;
    
    public Barang() {
        
    }
    
    public Barang(String nm, String jn, int st, int hs) {
        namaBarang = nm;
        jenisBarang = jn;
        stok = st;
        hargaSatuan = hs;
    }
    
    public void tampilBarang() {
        System.out.println("Nama\t\t: " + namaBarang);
        System.out.println("Jenis\t\t: " + jenisBarang);
        System.out.println("Stok\t\t: " + stok);
        System.out.println("Harga Satuan\t: " + hargaSatuan);
    }
    
    public void tambahStok(int n) {
        stok = stok + n;
    }
    
    public void kurangiStok(int n) {
        stok = stok - n;
    }
    
    public int hitungHargaTotal(int jumlah) {
        return jumlah * hargaSatuan;
    }
}
