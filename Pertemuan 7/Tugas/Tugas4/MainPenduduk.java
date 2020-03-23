package Tugas4;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class MainPenduduk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner fn = new Scanner(System.in);
        
        System.out.println("Pencarian Data Penduduk Berdasarkan NIK Penduduk");
        System.out.println("====================================================");
        System.out.print("Jumlah data : ");
        int jml = sc.nextInt();
        
        CariPenduduk pencarian = new CariPenduduk(jml);

        for (int i = 0; i < pencarian.jmlData; i++) {
            System.out.println("Penduduk ke-" + (i + 1));
            System.out.print("NIK : ");
            int nik = sc.nextInt();
            System.out.print("Nama : ");
            String nama = fn.nextLine();
            System.out.print("Alamat : ");
            String alamat = fn.nextLine();
            System.out.print("Jenis Kelamin : ");
            String jenisK = fn.nextLine();
            System.out.println();
            
            Penduduk P = new Penduduk(nik, nama, alamat, jenisK);
            pencarian.tambah(P);
        }
        
        System.out.print("Masukkan NIK data penduduk yang dicari : ");
        int cari = sc.nextInt();
        System.out.println("====================================================");
        int posisi = pencarian.FindSeqSearch(cari);
        pencarian.Tampilposisi(cari, posisi);
    }
}