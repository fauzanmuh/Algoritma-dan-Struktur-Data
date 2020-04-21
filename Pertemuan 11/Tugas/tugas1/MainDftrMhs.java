package tugas1;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class MainDftrMhs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DaftarMahasiswa data = new DaftarMahasiswa();
        Scanner sc = new Scanner(System.in);
        
        try {
            data.addFirst(1941720171, "Fauzan", "Malang");
            data.print();
            data.add(1941720009, "Dandi", "Lumajang", 1);
            data.print();
            data.addFirst(1941720054, "Fauzi", "Jogja");
            data.print();
            data.addByValue(1941720077, 1941720076, "Anonymous", "Unknown");
            data.print();
            data.removeByValue(1941720056);
            data.print();
            data.clear();
            
            int pilih = 0, pilih1, index, nim;
            String nama, alamat;
            do {
                try {
                    System.out.println("Menu");
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
                                    System.out.print("Masukkan NIM\t: ");
                                    nim = sc.nextInt();
                                    sc.nextLine();
                                    System.out.print("Masukkan Nama\t: ");
                                    nama = sc.nextLine();
                                    System.out.print("Masukkan Alamat\t: ");
                                    alamat = sc.nextLine();
                                    data.addFirst(nim, nama, alamat);
                                    break;
                                case 2:
                                    System.out.println("\nTambah (Index)");
                                    System.out.print("Masukkan NIM\t: ");
                                    nim = sc.nextInt();
                                    sc.nextLine();
                                    System.out.print("Masukkan Nama\t: ");
                                    nama = sc.nextLine();
                                    System.out.print("Masukkan Alamat\t: ");
                                    alamat = sc.nextLine();
                                    data.addFirst(nim, nama, alamat);
                                    System.out.print("Masukkan index\t: ");
                                    index = sc.nextInt();
                                    data.add(nim, nama, alamat, index);
                                    break;
                                case 3:
                                    System.out.print("Masukkan NIM\t: ");
                                    nim = sc.nextInt();
                                    sc.nextLine();
                                    System.out.print("Masukkan Nama\t: ");
                                    nama = sc.nextLine();
                                    System.out.print("Masukkan Alamat\t: ");
                                    alamat = sc.nextLine();
                                    data.addLast(nim, nama, alamat);
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
                                    System.out.print("Masukkan NIM : ");
                                    nim = sc.nextInt();
                                    data.removeByValue(nim);
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
                                    System.out.print("Masukkan NIM : ");
                                    nim = sc.nextInt();
                                    data.cariKey(nim);
                                    break;
                            }
                            break;
                        case 4:
                            System.out.println("\nKeluar Program");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Pilihan Salah!");
                    }
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                System.out.println();
                
            }
            while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
