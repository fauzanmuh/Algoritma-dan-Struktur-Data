package Perulangan;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class Perulangan1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan angka : ");
        int angka = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            angka -= 3;
        }
        System.out.println("Hasil Akhir = " + angka);
        if (angka % 2 == 0) {
            System.out.println("Hasil akhir adalah  bilangan genap");
        } 
        else {
            System.out.println("Hasil akhir adalah  bilangan ganjil");
        }
    }
}