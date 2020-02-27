package Tugas5;


import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class Main {
    static int n=4, c1=0, c2=0, c3=0;
    static int pilihan[] = new int[n];
    
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         Bem b = new Bem(n);
        
       //   System.out.println("Masukkan Jumlah Pemilihan :");
      //    n = input.nextInt()
        
        System.out.println("Nama Calon Ketua \n1.Bima \n2.Arian \n3.Darman");
        for(int i=0; i<pilihan.length; i++){
            System.out.print("Masukkan Pilihan Pemilih ke-"+(i+1)+" : ");
            pilihan[i] = input.nextInt();
        }
        System.out.println("Ketua BEM tahun 2020 adalah "+b.pemilihanBem(c3));
        if(c1 > c2 && c1 > c3){
            System.out.println("Bima");
        }else if(c2 > c1 && c2 > c3){
            System.out.println("Arlan");
        }else if(c3 > c1 && c3 > c2){
            System.out.println("Darman");
        }
    }
}
