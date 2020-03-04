package Praktikum1;

/**
 *
 * @author FauzanOIOI
 */
public class ContohBig0 {
    public static void ContohBig0(int[] angka) {
        System.out.println("Pairs : ");
        int n = angka.length;
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.println(angka[i] + "-" + angka[j]);
            }
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.println(angka[i] + "-" + angka[j]);
            }
        }
    }
    public static void main(String[] args) {
    }
    
}
