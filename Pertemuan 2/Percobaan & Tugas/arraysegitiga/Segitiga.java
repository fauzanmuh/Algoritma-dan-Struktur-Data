/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysegitiga;

/**
 *
 * @author FauzanOIOI
 */
public class Segitiga {
     public int alas;
    public int tinggi;
    public int sisi1, sisi2, sisi3;
    
    public Segitiga (int a, int t) {
        alas = a;
        tinggi = t;
    }
    public double hitungLuas(){
        return 0.5 * alas * tinggi /2;
    }
    public double hitungKeliling() {
        double hasil = sisi1 + sisi2 + sisi3 ;
        return hasil + alas + tinggi;
    }
}   