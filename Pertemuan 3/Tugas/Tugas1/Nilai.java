package Tugas1;

/**
 *
 * @author FauzanOIOI
 */
public class Nilai {
    public String namaMhs;
    public int nilaiTugas, nilaiKuis;
    public int nilaiUTS, nilaiUAS, jumlah;;
    public double total;
    
    double hitungTotalNilai(double nt, double nk, double nuts, double nuas) {
        total = ((nt * 0.3) + (nk *0.2) + (nuts * 0.2) + (nuas * 0.3));
        return total;
    }   
}