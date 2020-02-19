package programjajargenjang;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class ProgramJajarGenjang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JajarGenjang[] jgArray = new JajarGenjang[5];
       Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++) {
            jgArray[0] = new JajarGenjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan tinggi: ");
            jgArray[0].tinggi = sc.nextInt();
            System.out.print("Masukkan alas: ");
            jgArray[0].alas = sc.nextInt();
            System.out.print("Masukkan Sisi miring: ");
            jgArray[0].sisiMiring = sc.nextInt();
        }
        for(int i = 0; i < 5; i++) {
            System.out.println("Jajar Genjang ke-" + i);
            System.out.println("Tinggi: " +jgArray[0].tinggi + ", alas: " + jgArray[0].alas + ", Sisi miring: " + jgArray[0].sisiMiring);
        }
    }
    
}
