package minggu3;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class MainPangkat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================");
        System.out.println("1. BRUTE FORCE");
        System.out.println("2. DIVIDE AND CONQUER");
        System.out.print("Silahkan Masukkan Pilihan Anda : ");
        int pil = sc.nextInt();
        System.out.println("=============================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();
        
        Pangkat [] png = new Pangkat[elemen];
        
        for (int i=0; i<elemen; i++) {
            png[i] = new Pangkat();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1+" : "));
            png[i].nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+" : ");
            png[i].pangkat = sc.nextInt();
        }
        switch (pil) {
            case 1:
        System.out.println("=============================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i=0; i<elemen; i++) {
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
            break;
            case 2:
        System.out.println("=============================================");
        System.out.println("Hasil Faktorial dengan divide and Conquer");
        for (int i=0; i<elemen; i++) {
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatDC(png[i].nilai, png[i].pangkat));
            break;
        }
        System.out.println("=============================================");
    }
    }
}