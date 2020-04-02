package Tugas1;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class MainNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner fauzan = new Scanner(System.in);
        System.out.println("============================================");
        System.out.println("Program Menghitung Nilai Mahasiswa");
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jml = fauzan.nextInt();
        
        Nilai [] n = new Nilai[jml];
        
        for (int i=0; i<jml; i++) {
            fauzan.nextLine();
            n [i] = new Nilai();
            System.out.print("Mahasiswa ke-"+(i+1)+" : ");
            n[i].namaMhs = fauzan.nextLine();
            System.out.print("Masukkan Nilai Tugas : ");
            n[i].nilaiTugas = fauzan.nextInt();
             System.out.print("Masukkan Nilai Kuis : ");
            n[i].nilaiKuis = fauzan.nextInt();
             System.out.print("Masukkan Nilai UTS : ");
            n[i].nilaiUTS = fauzan.nextInt();
             System.out.print("Masukkan Nilai UAS : ");
            n[i].nilaiUAS = fauzan.nextInt();
            System.out.println("");
        }
        System.out.println("");
        System.out.println("============================");
        System.out.println("Total Nilai MATKUL ALGORITMA");
        System.out.println("============================");
        
        for (int i=0; i<jml; i++) {
            System.out.println("Mahasiswa ke-"+(i+1)+" : "+n[i].namaMhs);
            System.out.println("Nilai Tugas : "+n[i].nilaiTugas);
            System.out.println("Nilai Kuis : "+n[i].nilaiKuis);
            System.out.println("Nilai Kuis : "+n[i].nilaiUTS);
            System.out.println("Nilai Kuis : "+n[i].nilaiUAS);
            System.out.println("Total nilai Mahasiswa : "+n[i].hitungTotalNilai(n[i].nilaiTugas, n[i].nilaiKuis, n[i].nilaiUTS, n[i].nilaiUAS));
        }
        System.out.println("===============================================");
        
        Rata2 ra = new Rata2();
        for (int i=0; i<jml; i++) {
            System.out.println("Nilai Total Seluruh Mahasiswa : "+n[i].hitungTotalNilai(n[i].nilaiTugas, n[i].nilaiKuis, n[i].nilaiUTS, n[i].nilaiUAS)/4);
            ra.total += n[i].hitungTotalNilai(n[i].nilaiTugas, n[i].nilaiKuis, n[i].nilaiUTS, n[i].nilaiUAS);
        }
        System.out.println("Rata-rata nilai total seluruh mahasiswa : " + ra.hitungRata(jml));
    }
}