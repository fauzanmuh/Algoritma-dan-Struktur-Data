package Perpustakaan;

/**
 *
 * @author FauzanOIOI
 */
public class Node {
    String judul, penerbit;
    int kode, stok, rusak;
    Node prev, next;
    
    Node(Node prev, String judul, String penerbit, int kode, int stok, int rusak, Node next) {
        this.prev = prev;
        this.judul = judul;
        this.penerbit = penerbit;
        this.kode = kode;
        this.stok = stok;
        this.rusak = rusak;
        this.next = next;
    }
}