package Tugas3;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class MahasiswaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DaftarMahasiswa data = new DaftarMahasiswa();
        Scanner sc = new Scanner(System.in);
        String nama;
        int nilai;
        
        for(int i=0; i<5; i++) {
            
            System.out.print("Masukkan nama Mahasiswa\t\t: ");
            nama = sc.nextLine();
            System.out.print("Masukkan nilai Mahasiswa\t: ");
            nilai = sc.nextInt();
            sc.nextLine();
            data.addLast(nama, nilai);
            System.out.println(" ");
        }
        data.print();
        data.SelectionSort();
        data.print();
    }
}