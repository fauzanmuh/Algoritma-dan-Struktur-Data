package tugas2;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */

/* Studi kasus ini memanfaatkan Stack, yaitu Memasukkan baju ke dalam mesin cuci.
* Baju yang dimasukkan pertama kali adalah baju yang keluar paling akhir.
* Dan baju yang dimasukkan terakhir akan keluar pertama.
* indeks tumpukan dimulai dari 0 (teratas)
*/

public class MainDftrBaju {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DftrBaju data = new DftrBaju();
        Scanner sc = new Scanner(System.in);
        
        int pilih = 0, pilih1, id, berat, jumlah, index;
        String nama;
        do {
            try {
                System.out.println("===Mesin Cuci===");
                System.out.println("1. Tambah Baju Terbaru");
                System.out.println("2. Lihat Baju Teratas");
                System.out.println("3. Lihat Baju Terbawah");
                System.out.println("4. Lihat Semua Baju");
                System.out.println("5. Cari Baju");
                System.out.println("6. Keluarkan Baju Teratas");
                System.out.println("7. Keluarkan Semua Baju");
                System.out.println("8. Hitung Berat Seluruh Baju");
                System.out.println("9. Exit Program");
                System.out.print("Pilih menu\t: ");
                pilih = sc.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.println("\nTambah Baju");
                        System.out.print("ID Baju\t: ");
                        id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nama Baju\t: ");
                        nama = sc.nextLine();
                        System.out.print("Berat(gr)\t: ");
                        berat = sc.nextInt();
                        System.out.print("Jumlah\t\t: ");
                        jumlah = sc.nextInt();
                        data.addFirst(id, nama, berat, jumlah);
                        data.print();
                        break;
                    case 2:
                        data.getFirst();
                        break;
                    case 3:
                        data.getLast();
                        break;
                    case 4:
                        data.print();
                        break;
                    case 5:
                        System.out.println("\nSubmenu Cari");
                        System.out.println("1. Cari (Tumpukan)");
                        System.out.println("2. Cari (No Baju)");
                        System.out.print("Masukkan pilihan : ");
                        pilih1 = sc.nextInt();
                        switch (pilih1) {
                            case 1:
                                System.out.println("\nCari (Tumpukan)");
                                System.out.print("Masukkan tumpukan ke : ");
                                index = sc.nextInt();
                                data.cari(index);
                                break;
                            case 2:
                                System.out.println("\nCari (No Baju)");
                                System.out.print("Masukkan No Baju: ");
                                id = sc.nextInt();
                                data.cariKey(id);
                                break;
                        }
                        break;
                    case 6:
                        data.removeFirst();
                        break;
                    
                    case 7:
                        data.clear();
                        break;
                    case 8:
                        data.hitungBerat();
                        break;
                    case 9:
                        System.out.println("===Terima Kasih===");
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println();
        }
        while(pilih != 9);
    }
}