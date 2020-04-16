package Pertanyaan;

import java.util.Scanner;
/**
 *
 * @author FauzanOIOI
 */
public class MainLinkedLists {
     
    public static void main(String[] args) {
        LinkedList data = new LinkedList();
        Scanner sc = new Scanner(System.in);
        try {
            data.addFirst(2);
            data.print();
            data.add(4, 1);
            data.print();
            data.addFirst(1);
            data.print();
            data.addByValue(2, 3);
            data.print();
            data.removeByValue(4);
            data.print();
            data.clear();
            
            int pilih = 0, pilih1, nilai, index;
            do {
                System.out.println("\nMenu");
                System.out.println("1. Tambah");
                System.out.println("2. Hapus");
                System.out.println("3. Cari");
                System.out.println("4. Keluar");
                System.out.print("Masukkan pilihan : ");
                pilih = sc.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.println("\nSubmenu Tambah");
                        System.out.println("1. Tambah (First)");
                        System.out.println("2. Tambah (Index)");
                        System.out.println("3. Tambah (Last)");
                        System.out.print("Masukkan pilihan : ");
                        pilih1 = sc.nextInt();
                        switch (pilih1) {
                            case 1:
                                System.out.println("\nTambah (First)");
                                System.out.print("Masukkan Data : ");
                                nilai = sc.nextInt();
                                data.addFirst(nilai);
                                break;
                            case 2:
                                System.out.println("\nTambah (Index)");
                                System.out.print("Masukkan Data : ");
                                nilai = sc.nextInt();
                                System.out.print("Masukkan index : ");
                                index = sc.nextInt();
                                data.add(nilai, index);
                                break;
                            case 3:
                                System.out.println("\nTambah (Last)");
                                System.out.print("Masukkan Data : ");
                                nilai = sc.nextInt();
                                data.addLast(nilai);
                                break;
                        }
                        data.print();
                        break;
                    case 2:
                        System.out.println("\nSubmenu Hapus");
                        System.out.println("1. Hapus (Index)");
                        System.out.println("2. Hapus (Key)");
                        System.out.println("3. Clear");
                        System.out.print("Masukkan pilihan : ");
                        pilih1 = sc.nextInt();
                        switch (pilih1) {
                            case 1:
                                System.out.println("\nHapus (Index)");
                                System.out.print("Masukkan Index : ");
                                index = sc.nextInt();
                                data.remove(index);
                                break;
                            case 2:
                                System.out.println("\nHapus (Key)");
                                System.out.print("Masukkan Data : ");
                                nilai = sc.nextInt();
                                data.removeByValue(nilai);
                                break;
                            case 3:
                                data.clear();
                                break;
                        }
                        data.print();
                        break;
                    case 3:
                        System.out.println("\nSubmenu Cari");
                        System.out.println("1. Cari (Index)");
                        System.out.println("2. Cari (Key)");
                        System.out.print("Masukkan pilihan : ");
                        pilih1 = sc.nextInt();
                        switch (pilih1) {
                            case 1:
                                System.out.println("\nCari (Index)");
                                System.out.print("Masukkan Index : ");
                                index = sc.nextInt();
                                data.cari(index);
                                break;
                            case 2:
                                System.out.println("\nCari (Key)");
                                System.out.print("Masukkan Data : ");
                                nilai = sc.nextInt();
                                data.cariKey(nilai);
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("\nTerima Kasih");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Pilihan Salah!");
                }
            } 
            while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}