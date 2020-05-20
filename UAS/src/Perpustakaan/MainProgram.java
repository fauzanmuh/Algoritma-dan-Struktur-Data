package Perpustakaan;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class MainProgram {
    public static void menu() {
        System.out.println("============================================");
        System.out.println("                    BUKU");
        System.out.println("============================================");
        System.out.println("Memilih Menu");
        System.out.println("1. Buku Masuk");
        System.out.println("2. Buku Keluar");
        System.out.println("3. Buku Rusak");
        System.out.println("4. Tampilkan Semua Data");
        System.out.println("5. Pencarian Buku (Berdasarkan Kode Buku)");
        System.out.println("6. Keluar");
        System.out.println("============================================");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList obj = new DoubleLinkedList();
        String judul, penerbit;
        int kode, stok, rusak, index, pilih = 0;
        try {
            obj.addFirst("The Protector", "Sans", 121, 18, 3);
            obj.addLast("Cars", "Walt Disney", 124, 25, 4);
            do {
               menu();
                System.out.print("Masukkan pilihan Anda : ");
                pilih = sc.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.println("================================================");
                        System.out.println("                  Tambah BUKU");
                        System.out.println("================================================");
                        sc.nextLine();
                        System.out.print("Masukkan Judul\t\t: ");
                        judul = sc.nextLine();
                        System.out.print("Masukkan penerbit\t: ");
                        penerbit = sc.nextLine();
                        System.out.print("Masukkan Kode \t: ");
                        kode = sc.nextInt();
                        System.out.print("Masukkan Stok \t: ");
                        stok = sc.nextInt();
                        System.out.print("Masukkan Buku Rusak\t: ");
                        rusak = sc.nextInt();
                        obj.addFirst(judul, penerbit, kode, stok, rusak);
                        System.out.println("================================================");                        
                        System.out.println();
                        break;
                        
                    case 2:
                        System.out.print("Masukkan indeks yang ingin dihapus : ");
                        index = sc.nextInt();
                        obj.remove(index);
                        obj.print();
                        System.out.println("Buku keluar pada indeks ke-" + index + "berhasil dihapus!");
                        System.out.println();
                        break;   
                        
                    case 3:
                        System.out.println("===========================================");
                        System.out.println("               BUKU YANG KELUAR");
                        System.out.println("===========================================");
                        sc.nextLine();
                        System.out.print("Masukkan Indeks\t: ");
                        index = sc.nextInt();
                        System.out.print("Masukkan Judul\t: ");
                        judul = sc.nextLine();
                        System.out.print("Masukkan Penerbit\t: ");
                        penerbit = sc.nextLine();
                        System.out.print("Masukkan Kode \t: ");
                        kode = sc.nextInt();
                        System.out.print("Masukkan Stok \t: ");
                        stok = sc.nextInt();
                        System.out.print("Masukkan Rusak\t: ");
                        rusak = sc.nextInt();
                        obj.add(judul, penerbit, kode, stok, rusak, index);
                        obj.print();
                        System.out.println("===========================================");
                        System.out.println();
                        break;
                        
                    case 4:
                        obj.print();
                        obj.selectionSort();
                        System.out.println();
                        break;
                        
                    case 5:
                        System.out.print("Masukkan data yang ingin dicari : ");
                        kode = sc.nextInt();
                        obj.cari(kode);
                        System.out.println();
                        break;
                }
            }
            while(pilih != 6);
         } 
        catch(Exception e) {
            System.out.println(e.getMessage());
         }
    }
}