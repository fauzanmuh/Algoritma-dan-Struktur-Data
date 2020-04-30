package Tugas1;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class DoubleLinkedListsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedLists dll = new DoubleLinkedLists();
        
        int pilih = 0, data, indeks;
        do {
            try {
                System.out.println(" DOUBLE LINK LIST DENGAN MENU");
                System.out.println("==============================");
                System.out.println("Memilih menu");
                System.out.println("1. Tambah Awal");
                System.out.println("2. Tambah Akhir");
                System.out.println("3. Tambah Data Indeks Tertentu");
                System.out.println("4. Hapus Awal");
                System.out.println("5. Hapus Akhir");
                System.out.println("6. Hapus Indeks Tertentu");
                System.out.println("7. Cetak Data");
                System.out.println("8. Cari");
                System.out.println("9. Keluar");
                System.out.println("==============================");
                System.out.print(">> ");
                pilih = sc.nextInt();
                System.out.println("==============================");
                
                switch (pilih) {
                    case 1:
                        System.out.print("Masukkan data : ");
                        data = sc.nextInt();
                        dll.addFirst(data);
                        break;
                    case 2:
                        System.out.print("Masukkan data : ");
                        data = sc.nextInt();
                        dll.addLast(data);
                        break;
                    case 3:
                        System.out.print("Masukkan data : ");
                        data = sc.nextInt();
                        System.out.print("Masukkan Posisi indeks data : ");
                        indeks = sc.nextInt();
                        dll.add(data, indeks);
                        break;
                    case 4:
                        dll.removeFirst();
                        break;
                    case 5:
                        dll.removeLast();
                        break;
                    case 6:
                        System.out.print("Masukkan Posisi indeks data : ");
                        indeks = sc.nextInt();
                        dll.remove(indeks);
                        break;
                    case 7:
                        dll.print();
                        break;
                    case 8:
                        System.out.print("Masukkan data yang ingin dicari : ");
                        data = sc.nextInt();
                        dll.cari(data);
                        break;
                    case 9:
                        System.exit(0);
                        break;
                    default :
                        System.out.println("Pilihan salah!");
                }
            } 
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("==============================");
        } 
        while (pilih > 0 && pilih < 9);
    }
}
