package Pemilihan;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class Pemilihan1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double tgs, uts, uas, nAkhir, hTugas, hUts, hUas;
        System.out.print("Masukan nilai tugas anda : ");
        tgs = sc.nextDouble();
        if (tgs < 0 || tgs > 100) {
            System.out.println("Input yang anda masukan salah");
            tgs = 0;
        }
        System.out.print("Masukan nilai uts anda : ");
        uts = sc.nextDouble();
        if (uts < 0 || uts > 100) {
            System.out.println("Input yang anda masukan salah");
            uts = 0;
        }
        System.out.print("Masukan nilai uas anda : ");
        uas = sc.nextDouble();
        if (uas < 0 || uas > 100) {
            System.out.println("Input yang anda masukan salah");
            uas = 0;
        }

        hTugas = tgs * 20 / 100;
        hUts = uts * 35 / 100;
        hUas = uas * 45 / 100;
        nAkhir = hTugas + hUas + hUts;
        System.out.println("20% nilai tugas = " + hTugas);
        System.out.println("35% nilai uts = " + hUts);
        System.out.println("45% nilai uas = " + hUas);
        System.out.println("nilai akhir anda = " + nAkhir);
    }
}