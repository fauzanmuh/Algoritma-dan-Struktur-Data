package Minggu8;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class PostfixMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        
        System.out.println("Masukkan ekspresi matematika: ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";
        
        int total = Q.length();
        
        Postfix post = new Postfix(total);
        P = post.konversi(Q);
        System.out.println("Postfix: "+P);
    }
}
