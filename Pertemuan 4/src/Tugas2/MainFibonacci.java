package Tugas2;

import static Tugas2.Fibonacci.fibo;
import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class MainFibonacci {
    

    public static void main(String[] args) {
        // Brute Force
        Scanner sc = new Scanner(System.in); //0(1)
        int angka, htg, htg1 = 0, htg2 = 1; //0(1)
        System.out.print("Masukan Angka : "); //0(1)
        angka = sc.nextInt(); //0(1)
        System.out.println("Hasil bilangan fibonacci: "); //0(1)
        for (int i = 0; i < angka; i++) { //0(n)
            if (i == 0 || i == 1) { //0(1)
                continue; //0(1)
            }
            htg = htg1 + htg2; //0(1)
            System.out.println(htg1 + " + " + htg2 + " = " + htg); //0(1)
            htg1 = htg2; //0(1)
            htg2 = htg; //0(1)
        }
        System.out.println("Hasil bilangan fibonacci: "); //0(1)
        for (int i = 0; i < angka; i++) { //0(n)
            int hasil = fibo(i); //0(1)
            System.out.print(hasil + " "); //0(1)
        }
    }
 }

// = 0(1+1+1+1+1+(n*1*1)+1+1+1+1+1+(n*1*1))
// = 0(10 n^2)
// = 0(n^2)