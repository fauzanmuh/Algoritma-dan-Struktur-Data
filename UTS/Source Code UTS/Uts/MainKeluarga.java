package Uts;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class MainKeluarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner fn = new Scanner(System.in);
        ProgKeluarga pk = new ProgKeluarga();
        System.out.print("Masukkan jumlah Anggota Keluarga\t: ");
        int jumlahData = sc.nextInt();
        pk.ProgKeluarga(jumlahData);
        sc.nextLine();
        System.out.println("");

        for (int i = 0; i < jumlahData; i++) {
            System.out.printf("Input Data Anggota Keluarga %d\n", (i + 1));
            System.out.print("Nama\t: ");
            String nama = fn.nextLine();
            System.out.print("Posisi\t: ");
            String posisi = fn.nextLine();
            System.out.print("Umur\t: ");
            int umur = sc.nextInt();
            System.out.println("=====================================");

            DataKeluarga dk = new DataKeluarga(nama, posisi, umur);
            pk.tambah(dk);
        }
        System.out.println("Pengurutan Berdasarkan Umur Termuda-Tertua");
        pk.selectionSortAsc();
        pk.tampil();
        System.out.print("Cari anggota keluarga berdasarkan umur : ");
        int cari = sc.nextInt();
        int posisi = pk.FindBinarySearch(cari, 0, jumlahData);
        pk.Tampilpoisisi(cari, posisi);
    }
}
