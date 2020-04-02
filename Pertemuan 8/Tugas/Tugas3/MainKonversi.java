package Tugas3;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class MainKonversi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);
        String P, Q, eksp = "";
        System.out.println("Masukkan ekspresi matematika : ");
        Q = fn.nextLine();
        for(int i = (Q.length()-1); i >= 0; i--){
            eksp = eksp + Q.charAt(i);
        }
        eksp = eksp.trim();
        eksp = eksp + "(";
        
        int total = eksp.length();
        
        Konversi pref = new Konversi(total);
        P = pref.konversi(eksp);
        System.out.println("Prefix: " + new StringBuffer(P).reverse());
    }
    
}
