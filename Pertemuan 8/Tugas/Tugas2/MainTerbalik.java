package Tugas2;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class MainTerbalik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);
        
        System.out.print("Masukkan kalimat\t: ");
        String kalimat = fn.nextLine();
        String kata[] = kalimat.split("\\s+");
        Terbalik tumpukan = new Terbalik(kata.length);

        for(int i=0; i<kata.length; i++){
            tumpukan.push(kata[i]);
        }
        
        tumpukan.print();
    } 
}
