package Tugas;

/**
 *
 * @author FauzanOIOI
 */
public class Tiket {
    public String namaMaskapai;
    public float harga;
    public int transitCount;
    public int flightTime;
    
    public Tiket(String nm, float hr, int tc, int ft){
        namaMaskapai = nm;
        harga = hr;
        transitCount = tc;
        flightTime = ft;
    }
    
    public void tampil(){
        System.out.println("Nama Maskapai\t\t= " + namaMaskapai);
        System.out.println("Harga Tiket\t\t= Rp. " + harga);
        System.out.println("Transit Penerbangan\t= " + transitCount);
        System.out.println("Jam Penerbangan\t\t= " + flightTime);
    }
}