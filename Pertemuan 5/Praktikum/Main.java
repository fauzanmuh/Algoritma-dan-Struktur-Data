package Praktikum;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        DaftarMahasiswaBerprestasi data = new DaftarMahasiswaBerprestasi();
        int jumMhs = 5;
        
        for(int i=0; i<jumMhs; i++) {
            System.out.print("Nama = ");
            String nama = s1.nextLine();
            System.out.print("Tahun masuk = ");
            int thn = s.nextInt();
            System.out.print("Umur = ");
            int umur = s.nextInt();
            System.out.print("IPK = ");
            double ipk = s.nextDouble();
            
            Mahasiswa m = new Mahasiswa(nama, thn, umur, ipk);
            data.tambah(m);
        }
        System.out.println("Data Mahasiswa sebelum Sorting = ");
        data.tampil();
        
        System.out.println("Data Mahasiswa setelah Sorting desc berdasar IPK = ");
        data.bubbleSort();
        data.tampil();
        
        System.out.println("Data Mahasiswa setelah Sorting asc berdasar IPK = ");
        data.selectionSort();
        data.tampil();
        
        System.out.println("Data Mahasiswa setelah Di Insertion Sort = ");
        data.insertionSort();
        data.tampil();
    }
}
