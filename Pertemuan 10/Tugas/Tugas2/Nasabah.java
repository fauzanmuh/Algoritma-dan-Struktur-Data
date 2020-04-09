package Tugas2;

/**
 *
 * @author FauzanOIOI
 */
public class Nasabah {
    String noRekening, nama;
    Nasabah(String noRek, String nm){
        noRekening = noRek;
        nama = nm;
    }
    
    Nasabah() {
        
    }
    
    void print() {
        System.out.println("Nama Nasabah\t: " + nama);
        System.out.println("Rekening\t: " + noRekening);
        System.out.println("------------------------");
    }
}
