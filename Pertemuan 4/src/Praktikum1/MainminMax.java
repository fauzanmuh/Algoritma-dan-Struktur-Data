package Praktikum1;

import static Praktikum1.minMax.max_min;
import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class MainminMax {

    public static void main(String[] args) {
        minMax [] ppArray = new minMax[5]; //0(1)
        ppArray [0] = new minMax(); //0(1)
        
        int min = ppArray[0].nilaiArray; //0(1)
        int max = ppArray[0].nilaiArray; //0(1)
        
        int nilaiArray[] = new int[5]; //0(1)
        
        Scanner sc = new Scanner(System.in); //0(1)
        
        for(int i=0; i<5; i++) { //0(n)
            ppArray[i] = new minMax(); //0(1)
            System.out.println("Nilai array indeks ke-"+i); //0(1)
            System.out.print("Masukkan nilai : "); //0(1)
            ppArray[i].nilaiArray = sc.nextInt(); //0(1)
        }
        
        for(int i=0; i<5; i++) { //0(n)
            if(ppArray[i].nilaiArray < min) //0(1)
                min = ppArray[i].nilaiArray; //0(1)
            else if(ppArray[i].nilaiArray > max) //0(1)
                max = ppArray[i].nilaiArray; //0(1)
        }
        System.out.println("Brute Force"); //0(1)
        System.out.println("Nilai Minimal : "+min); //0(1)
        System.out.println("Nilai Maksimal : "+max); //0(1)
        
        int arr [] = new int[5]; //0(1)
        for(int i=0; i<5; i++) { //0(n)
            arr[i] = ppArray[i].nilaiArray; //0(1)
        }
        minMax hasil = new minMax(); //0(1)
        max_min(nilaiArray, 0, 4, hasil); //0(1)
        
        System.out.println("Divide Conquer"); //0(1)
        System.out.print("Nilai Minimal : "+hasil.minimum+"\nNilai Maksimal : "+hasil.maximum); //0(1)
        System.out.println("\n"); //0(1)
        }
    } 
// = 0(1+1+1+1+1+1+(n*1*1*1)+1+1+1+1+(n*1)+1+1+1+1+1)
// = 0(15 n^2)
// = 0(n^2)