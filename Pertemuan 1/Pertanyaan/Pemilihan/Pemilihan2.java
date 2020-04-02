package Pemilihan;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class Pemilihan2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int masukan;
        System.out.println("PENENTU KELIPATAN 2, 6, 15");
        System.out.print("Masukan angka : ");
        masukan = sc.nextInt();

        if (masukan % 2 == 0 && masukan % 6 == 0 && masukan % 15 == 0) {
            System.out.println("Bilangan kelipatan 2,6,dan 15");
        } 
        else if (masukan % 2 == 0 && masukan % 6 == 0) {
            System.out.println("Bilangan kelipatan 2,dan 6");
        }
        else if (masukan % 6 == 0 && masukan % 15 == 0) {
            System.out.println("Bilangan kelipatan 6, dan 15");
        }
        else if (masukan % 15 == 0 && masukan % 2 == 0) {
            System.out.println("Bilangan kelipatan 2, dan 15");
        }
        else if (masukan % 2 == 0) {
            System.out.println("Bilangan kelipatan 2");
        }
        else if (masukan % 6 == 0) {
            System.out.println("Bilangan kelipatan 6");
        }
        else if (masukan % 15 == 0) {
            System.out.println("Bilangan kelipatan 15");
        }
        else {
            System.out.println("Bilangan bukan kelipatan 2, 6, ataupun 15");
        }
    }
}