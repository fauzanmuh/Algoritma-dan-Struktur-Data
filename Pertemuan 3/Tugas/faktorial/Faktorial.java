package faktorial;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class Faktorial {
    public int nilai;
    
    public int faktorialBF(int n) {
        int fakto = 1;
        int i = 1;
        while(i < fakto) {
            fakto = fakto * 1;
            i++;
        }
        return fakto;
    }
    
    public int faktorialDC(int n) {
        if (n==1) {
            return 1;
        }
        else {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();
        
        Faktorial [] fk = new Faktorial[elemen];
        for (int i=0; i<elemen; i++) {
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-"+(i+1)+" : ");
            fk[i].nilai = sc.nextInt();
        }
            System.out.println("===========================");
            System.out.println("Hasil Faktorial dengan Brute Force");
            double start = System.nanoTime();
            for (int i = 0; i < elemen; i++){
                System.out.println("Faktorial dari nilai " + fk[i].nilai+ " adalah : " + fk [i].faktorialBF(fk[i].nilai));
            }
            double finish = System.nanoTime();
            System.out.println("Waktu eksekusi Program adalah : " + finish);
            
            
            System.out.println("=============================");
            System.out.println("Hasil Faktorial dengan divide and conquer");
            start = System.nanoTime();
            for (int i = 0; i < elemen; i++){
                System.out.println("faktorial dari nilai " + fk[i].nilai+ " adalah : " +fk[i].faktorialDC(fk[i].nilai));
            }
            finish = System.nanoTime();
            System.out.println("waktu eksekusi program adalah : " + finish);
            System.out.println("==============================");
            }
    }