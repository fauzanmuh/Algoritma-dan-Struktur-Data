package BruteForce;

/**
 *
 * @author FauzanOIOI
 */
public class Soal1 {
    
    private static void match(char[] t, char[] p) {
     int j;
     int cek = 0;
     
     for (int i = 0; i <= t.length - p.length; i++) {
        j = 0;
        while (j < p.length && t[i + j] == p[j]){
           j++;
        }
        if (j >= p.length) {
           cek++;
        }
     }
     if (cek > 0) {
        System.out.println("DATA COCOK");
     } 
     else {
        System.out.println("DATA TIDAK COCOK");
     }
  }
    
    public static void main(String[] args) {
      char[] x = {'N', 'G', 'A'};
      char[] y = {'S', 'E', 'M', 'A', 'N', 'G', 'A', 'T'};
      match(y, x);
   }
}
