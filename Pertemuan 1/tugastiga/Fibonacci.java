package tugastiga;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class Fibonacci {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    char[] huruf = new char[19]; 
    int[] jumH = new int[19]; 
    int jumlahHb = 0; 
    String kalimat; 

    System.out.print("Masukan kalimat : ");
    kalimat = input.nextLine();

    if(kalimat.isEmpty()) {
    System.out.println("Silahkan Isi Kalimat");
    } 
    else {
    huruf[0] = kalimat.charAt(0); 
    jumH[0] = 1; 
    jumlahHb = 1; 

    for(int i = 1; i < kalimat.length(); i++){
        boolean sudahMuncul = false; 
    for(int j = 0; j < jumlahHb; j++){
     if(kalimat.charAt(i) == huruf[j]){
      sudahMuncul = true;
      jumH[j] += 1;
     }
    }
    if(!sudahMuncul){
     huruf[jumlahHb] = kalimat.charAt(i);
     jumH[jumlahHb] = 1;
     jumlahHb++;
    }
   }
   System.out.println("\nHasil :");
   for(int i = 0; i < jumlahHb; i++){
    System.out.println("Huruf " + huruf[i] + " : " + jumH[i] + " buah");
   }
  }
 }
}