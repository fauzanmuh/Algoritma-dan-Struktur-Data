package DivideConquer;

/**
 *
 * @author FauzanOIOI
 */
public class Soal2 {
    
    static void towerOfHanoi(int n, char s, char d, char p) {
        if (n == 1) {
            System.out.println("Pindah 1 gelang dari tower " +s+ " ke tower " +d);
            return;
        }
        towerOfHanoi (n-1, s, p, d);
        System.out.println("Pindah gelang " +n+ " dari tower " +s+ " ke tower " +d);
        towerOfHanoi (n-1, p, d, s);
    }
    
    public static void main(String[] args) {
        int n = 4;
        towerOfHanoi (n, 'A', 'C', 'B');
    }
}
