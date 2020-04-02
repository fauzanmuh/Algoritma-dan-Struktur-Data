package Tugas1;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class MainModifikasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);
        
        System.out.print("Masukkan kalimat\t: ");
        String kalimat = fn.nextLine();
        String kata[] = kalimat.split("\\s+");
        Modifikasi tumpukan = new Modifikasi(kata.length);

        for(int i = 0; i < kata.length; i++){
            tumpukan.push(kata[i]);
        }
        
        tumpukan.print();

        tumpukan.pop();
        tumpukan.peek();
        tumpukan.print();
    }
}