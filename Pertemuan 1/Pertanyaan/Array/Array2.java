package Array;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class Array2 {
     public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int array1[][] = new int[4][5];
        int total = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[1].length; j++) {
                System.out.print("Masukan angka index ke-[" + i + "][" + j + "] = ");
                array1[i][j] = sc.nextInt();
            }
        }
        for (int i[] : array1) {
            for (int j : i) {
                total += j;
            }
        }
        System.out.println("Total isi array : " + total);
    }
}