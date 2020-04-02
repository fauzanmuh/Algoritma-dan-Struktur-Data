package Fungsi;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class Fungsi1 {
     public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int angka, htg, htg1 = 0, htg2 = 1;
        System.out.print("Masukan Angka : ");
        angka = sc.nextInt();
        System.out.println("Hasil bilangan fibonacci: ");
        for (int i = 0; i < angka; i++) {
            if (i == 0 || i == 1) {
                continue;
            }
            htg = htg1 + htg2;
            System.out.println(htg1 + " + " + htg2 + " = " + htg);
            htg1 = htg2;
            htg2 = htg;
        }
        System.out.println("Hasil bilangan fibonacci: ");
        for (int i = 0; i < angka; i++) {
            int hasil = rekursif(i);
            System.out.print(hasil + " ");
        }
    }

    static int rekursif(int angka) {
        if (angka == 0 || angka == 1) {
            return angka;
        }
        else {
            return (rekursif(angka - 1) + rekursif(angka - 2));
        }
    }
}
