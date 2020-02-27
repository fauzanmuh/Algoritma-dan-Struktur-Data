package Tugas6;

import java.util.Scanner;

/**
 *
 * @author FauzanOIOI
 */
public class ModifRata {
    public String namaMhs[];
    public int jmlh;
    public double rata[];
    public double nilai;

    public ModifRata(int jmlh) {
        this.namaMhs = new String[jmlh];
        this.nilai= 0;
        this.rata = new double [jmlh];
        this.jmlh=jmlh;
    }
    
    double rataDC(double arr[], int a, int b){
        if(a==b){
            return arr[1];
        }
        else if(a<b){
            int nilai= (a+b)/2;
            double anilai=rataDC(arr, a, nilai-1);
            double bnilai = rataDC(arr, nilai+1, b);
            return bnilai+anilai + arr[nilai];
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner fn = new Scanner(System.in);
        
        System.out.println("===== PROGRAM PERHITUNGAN RATA-RATA DC=======");
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int n= sc.nextInt();
        
        ModifRata arr= new ModifRata(n);
        System.out.println();
        for(int i=0;i<n; i++){
            System.out.print("Masukkan Nama Mahasiswa " + (i+1) + " : ");
            arr.namaMhs[i] = fn.nextLine();
            System.out.print("Masukkan nilai : ");
            arr.rata[i] = sc.nextInt();
            System.out.println();
        }
        for(int i=0; i<arr.jmlh;i++){
            System.out.println("nilai " + arr.namaMhs[i]+" : "+ arr.rata[i]);
        }
        System.out.println();
        System.out.println("Rata-rata Nilai Mahasiswa : "+ String.format("%.2f", arr.rataDC(arr.rata, 0, arr.jmlh)));
    }
}