package Perulangan;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class Perulangan2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan saldo anda : Rp. ");
        int saldo = sc.nextInt();
        for (int i = 0; i < 12; i++) {
            System.out.println("Saldo bulan ke-" + (i + 1) + " = Rp. " + saldo);
            saldo = saldo + (saldo * 2 / 100);
        }
    }
}
